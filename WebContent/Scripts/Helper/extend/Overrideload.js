Ext.override(Ext.data.TreeStore, {
    onBeforeNodeExpand: function (node, callback, scope) {
        if (node.isLoaded()) {
            Ext.callback(callback, scope || node, [node.childNodes]);
        }
        else if (node.isLoading()) {
            this.on('load', function () {
                Ext.callback(callback, scope || node, [node.childNodes]);
            }, this, { single: true });
        }
        else {
            this.read({
                node: node,
                callback: function (a, b, c) {
                    if (c) {
                        Ext.callback(callback, scope || node, [node.childNodes]);
                    }
                }
            });
        }
    }
});

Ext.override(Ext.tree.Panel, {

    initComponent: function () {
        var me = this,
            cls = [me.treeCls];

        if (me.useArrows) {
            cls.push(Ext.baseCSSPrefix + 'tree-arrows');
            me.lines = false;
        }

        if (me.lines) {
            cls.push(Ext.baseCSSPrefix + 'tree-lines');
        } else if (!me.useArrows) {
            cls.push(Ext.baseCSSPrefix + 'tree-no-lines');
        }

        if (Ext.isString(me.store)) {
            me.store = Ext.StoreMgr.lookup(me.store);
        } else if (!me.store || Ext.isObject(me.store) && !me.store.isStore) {
            me.store = Ext.create('Ext.data.TreeStore', Ext.apply({}, me.store || {}, {
                root: me.root,
                fields: me.fields,
                model: me.model,
                folderSort: me.folderSort
            }));
        } else if (me.root) {
            me.store = Ext.data.StoreManager.lookup(me.store);
            me.store.setRootNode(me.root);
            if (me.folderSort !== undefined) {
                me.store.folderSort = me.folderSort;
                me.store.sort();
            }
        }

        // if (me.initialConfig.rootVisible === undefined && !me.getRootNode()) {
        //     me.rootVisible = false;
        // }

        me.viewConfig = Ext.applyIf(me.viewConfig || {}, {
            rootVisible: me.rootVisible,
            animate: me.enableAnimations,
            singleExpand: me.singleExpand,
            node: me.store.getRootNode(),
            hideHeaders: me.hideHeaders
        });

        me.mon(me.store, {
            scope: me,
            rootchange: me.onRootChange,
            clear: me.onClear
        });

        me.relayEvents(me.store, [

            'beforeload',


            'load'
        ]);

        me.store.on({
            append: me.createRelayer('itemappend'),
            remove: me.createRelayer('itemremove'),
            move: me.createRelayer('itemmove'),
            insert: me.createRelayer('iteminsert'),
            beforeappend: me.createRelayer('beforeitemappend'),
            beforeremove: me.createRelayer('beforeitemremove'),
            beforemove: me.createRelayer('beforeitemmove'),
            beforeinsert: me.createRelayer('beforeiteminsert'),
            expand: me.createRelayer('itemexpand'),
            collapse: me.createRelayer('itemcollapse'),
            beforeexpand: me.createRelayer('beforeitemexpand'),
            beforecollapse: me.createRelayer('beforeitemcollapse')
        });

        if (!me.columns) {
            if (me.initialConfig.hideHeaders === undefined) {
                me.hideHeaders = true;
            }
            me.columns = [{
                xtype: 'treecolumn',
                text: 'Name',
                flex: 1,
                dataIndex: me.displayField
            }];
        }

        if (me.cls) {
            cls.push(me.cls);
        }
        me.cls = cls.join(' ');
        me.callParent();

        me.relayEvents(me.getView(), [

            'checkchange'
        ]);
        if (!me.getView().rootVisible && !me.getRootNode() && me.store.autoLoad) {
            me.setRootNode({
                expanded: true
            });
        }
    }
});
