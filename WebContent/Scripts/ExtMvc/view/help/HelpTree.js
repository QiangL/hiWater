Ext.define('SinoydFramework.view.help.HelpTree', {
    extend: 'Ext.tree.Panel',
    alias: 'widget.helpHelpTree',
    split: true,
    border: false,
    width: 200,
    title: '目录',
    autoScroll: true,
    collapisble: false,
    store: 'help.HelpTree',
    rootVisiable: false,
    draggable: false,
    animate: true,
    maxSize: 350,
    minSize: 200,
    initComponent: function () {
        this.addEvents('menuClick');
        this.Menu = Ext.create('Ext.menu.Menu', {
            items: [{
                text: '新增帮助',
                iconCls: 'add',
                action: 'addHelp',
                handler: function (obj, event) {
                    var folderTree = obj.ownerCt.params.tree.ownerCt;
                    if (folderTree) {
                        folderTree.fireEvent('menuClick', obj, event, 'addHelp');
                    }
                }
            }, {
                text: '编辑帮助',
                action: 'editHelp',
                iconCls: 'application_edit',
                handler: function (obj, event) {
                    var folderTree = obj.ownerCt.params.tree.ownerCt;
                    if (folderTree) {
                        folderTree.fireEvent('menuClick', obj, event, 'editHelp');
                    }
                }
            }, {
                text: '删除帮助',
                action: 'deleteHelp',
                iconCls: 'delete',
                handler: function (obj, event) {
                    var folderTree = obj.ownerCt.params.tree.ownerCt;
                    if (folderTree) {
                        folderTree.fireEvent('menuClick', obj, event, 'deleteHelp');
                    }
                }
            }]
        }),
        this.tbar = new Ext.Toolbar({
            autoWidth: true,
            autoShow: true,
            items: [
            {
                text: '展开',
                iconCls:'arrow_out_longer',
                handler: function () {
                    this.up().up().expandAll();
                }
            },
            {
                text: '收起',
                iconCls: 'arrow_in_longer',
                handler: function () {
                    this.up().up().collapseAll();
                }
            }
            ]
        }),
        this.callParent(arguments);
    },
    viewConfig: {
        stripeRows: true
    }
});