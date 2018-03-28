/*以下改动为是：给树添加允许为叶子节点添加子节点功能 --by lihong 2012/2/24
通过TreeViewDragDrop的allowLeafInserts为true或false进行配置 
例：
//    Ext.define('myTree', {
//        extend: 'Ext.tree.Panel',
//        viewConfig: {
//            plugins: {
//                ptype: 'treeviewdragdrop',
//                allowLeafInserts : true
//            }
//        }
//    }
//*/
Ext.override(Ext.tree.ViewDropZone, {
    getPosition: function (e, node) {
        var view = this.view,
          record = view.getRecord(node),
          y = e.getPageY(),
          noAppend = record.isLeaf(),
          noBelow = false,
          region = Ext.fly(node).getRegion(),
          fragment;

        if (record.isRoot()) {
            return 'append';
        }

        if (this.appendOnly) {
            return noAppend ? false : 'append';
        }
        if (!this.allowParentInsert) {
            //leehom modify begin
            noBelow = this.allowLeafInserts || (record.hasChildNodes() && record.isExpanded());
            //leehom modify end
        }

        fragment = (region.bottom - region.top) / (noAppend ? 2 : 3);
        if (y >= region.top && y < (region.top + fragment)) {
            return 'before';
        }
        else if (!noBelow && (noAppend || (y >= (region.bottom - fragment) && y <= region.bottom))) {
            return 'after';
        }
        else {
            return 'append';
        }
    },
    isValidDropPoint: function (node, position, dragZone, e, data) {
        if (!node || !data.item) {
            return false;
        }

        var view = this.view,
            targetNode = view.getRecord(node),
            draggedRecords = data.records,
            dataLength = draggedRecords.length,
            ln = draggedRecords.length,
            i, record;

        // No drop position, or dragged records: invalid drop point
        if (!(targetNode && position && dataLength)) {
            return false;
        }

        // If the targetNode is within the folder we are dragging
        for (i = 0; i < ln; i++) {
            record = draggedRecords[i];
            if (record.isNode && record.contains(targetNode)) {
                return false;
            }
        }

        // Respect the allowDrop field on Tree nodes
        if (position === 'append' && targetNode.get('allowDrop') === false) {
            return false;
        }
        else if (position != 'append' && targetNode.parentNode.get('allowDrop') === false) {
            return false;
        }

        // If the target record is in the dragged dataset, then invalid drop
        if (Ext.Array.contains(draggedRecords, targetNode)) {
            return false;
        }

        // @TODO: fire some event to notify that there is a valid drop possible for the node you're dragging
        // Yes: this.fireViewEvent(blah....) fires an event through the owning View.
        return true;
    },

    onNodeOver: function (node, dragZone, e, data) {
        var position = this.getPosition(e, node),
            returnCls = this.dropNotAllowed,
            view = this.view,
            targetNode = view.getRecord(node),
            indicator = this.getIndicator(),
            indicatorX = 0,
            indicatorY = 0;

        // auto node expand check
        this.cancelExpand();
        if (position == 'append' && !this.expandProcId && !Ext.Array.contains(data.records, targetNode) && !targetNode.isLeaf() && !targetNode.isExpanded()) {
            this.queueExpand(targetNode);
        }


        if (this.isValidDropPoint(node, position, dragZone, e, data)) {
            this.valid = true;
            this.currentPosition = position;
            this.overRecord = targetNode;

            indicator.setWidth(Ext.fly(node).getWidth());
            indicatorY = Ext.fly(node).getY() - Ext.fly(view.el).getY() - 1;

            /*
            * In the code below we show the proxy again. The reason for doing this is showing the indicator will
            * call toFront, causing it to get a new z-index which can sometimes push the proxy behind it. We always 
            * want the proxy to be above, so calling show on the proxy will call toFront and bring it forward.
            */
            if (position == 'before') {
                returnCls = targetNode.isFirst() ? Ext.baseCSSPrefix + 'tree-drop-ok-above' : Ext.baseCSSPrefix + 'tree-drop-ok-between';
                indicator.showAt(0, indicatorY);
                dragZone.proxy.show();
            } else if (position == 'after') {
                returnCls = targetNode.isLast() ? Ext.baseCSSPrefix + 'tree-drop-ok-below' : Ext.baseCSSPrefix + 'tree-drop-ok-between';
                indicatorY += Ext.fly(node).getHeight();
                indicator.showAt(0, indicatorY);
                dragZone.proxy.show();
            } else {
                returnCls = Ext.baseCSSPrefix + 'tree-drop-ok-append';
                // @TODO: set a class on the parent folder node to be able to style it
                indicator.hide();
            }
        } else {
            this.valid = false;
        }

        this.currentCls = returnCls;
        return returnCls;
    },
    handleNodeDrop: function (data, targetNode, position) {
        var me = this,
          view = me.view,
          parentNode = targetNode.parentNode,
          store = view.getStore(),
          recordDomNodes = [],
          records, i, len,
          insertionMethod, argList,
          needTargetExpand,
          transferData,
          processDrop;
        if (data.copy) {
            records = data.records;
            data.records = [];
            for (i = 0, len = records.length; i < len; i++) {
                data.records.push(Ext.apply({}, records[i].data));
            }
        }
        me.cancelExpand();
        if (position == 'before') {
            insertionMethod = parentNode.insertBefore;
            argList = [null, targetNode];
            targetNode = parentNode;
        }
        else if (position == 'after') {
            if (targetNode.nextSibling) {
                insertionMethod = parentNode.insertBefore;
                argList = [null, targetNode.nextSibling];
            }
            else {
                insertionMethod = parentNode.appendChild;
                argList = [null];
            }
            targetNode = parentNode;
        }
        else {
            //leehom add begin
            if (this.allowLeafInserts) {
                if (targetNode.get('leaf')) {
                    targetNode.set('leaf', false);
                    targetNode.set('expanded', true);
                }
            }
            //leehom add end
            if (!targetNode.isExpanded()) {
                needTargetExpand = true;
            }
            insertionMethod = targetNode.appendChild;
            argList = [null];
        }

        transferData = function () {
            var node;
            for (i = 0, len = data.records.length; i < len; i++) {
                argList[0] = data.records[i];
                node = insertionMethod.apply(targetNode, argList);

                if (Ext.enableFx && me.dropHighlight) {
                    recordDomNodes.push(view.getNode(node));
                }
            }
            if (Ext.enableFx && me.dropHighlight) {
                Ext.Array.forEach(recordDomNodes, function (n) {
                    if (n) {
                        Ext.fly(n.firstChild ? n.firstChild : n).highlight(me.dropHighlightColor);
                    }
                });
            }
        };
        if (needTargetExpand) {
            targetNode.expand(false, transferData);
        }
        else {
            transferData();
        }
    }
});


Ext.override(Ext.tree.plugin.TreeViewDragDrop, {
    allowLeafInserts: true,

    onViewRender: function (view) {
        var me = this;
        if (me.enableDrag) {
            me.dragZone = Ext.create('Ext.tree.ViewDragZone', {
                view: view,
                allowLeafInserts: me.allowLeafInserts,
                ddGroup: me.dragGroup || me.ddGroup,
                dragText: me.dragText,
                repairHighlightColor: me.nodeHighlightColor,
                repairHighlight: me.nodeHighlightOnRepair
            });
        }

        if (me.enableDrop) {
            me.dropZone = Ext.create('Ext.tree.ViewDropZone', {
                view: view,
                ddGroup: me.dropGroup || me.ddGroup,
                allowContainerDrops: me.allowContainerDrops,
                appendOnly: me.appendOnly,
                allowLeafInserts: me.allowLeafInserts,
                allowParentInserts: me.allowParentInserts,
                expandDelay: me.expandDelay,
                dropHighlightColor: me.nodeHighlightColor,
                dropHighlight: me.nodeHighlightOnDrop
            });
        }
    }
});
////////////////树叶子节点改动结束//////////////////////////////////////////////////////////  