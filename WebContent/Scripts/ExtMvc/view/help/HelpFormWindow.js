Ext.define('SinoydFramework.view.help.HelpFormWindow', {
    extend: 'Ext.window.Window',
    closable: true,
    closeAction: 'hide',
    alias: 'widget.helpHelpFormWindow',
    width: 400,
    height: 160,
    border: false,
    selectTreeNode: '',
    operatorMode:'',//标识操作模式，新增帮助还是编辑帮助
    bodyBorder: false,
    items: {
        xtype: 'form',
        frame: true,
        border: false,
        bodyBorder: false,
        bodyStyle: 'padding:5px',
        fieldDefaults: {
            msgTarget: 'side',
            labelWidth: 75,
            anchor: '100%'
        },
        items: [{
            xtype: 'hidden',
            name: 'Id'
        }, {
            xtype: 'hidden',
            name: 'ParentID'
        },{
            xtype: 'textfield',
            fieldLabel: '名称',
            width: 300,
            msgTarget: 'side',
            allowBlank: false,
            emptyText: '标题不能为空',
            name: 'Name'
        }, {
            fieldLabel: '添加模式',
            xtype: 'radiogroup',
            name: 'AddMode',
            msgTarget: 'side',
            allowBlack: false,
            listeners: {
                change: function (field, newVal, oldVal) {
                    var win = field.up().up();
                    switch (newVal.WriteHelp) {
                        case '0':
                            win.down('textfield[name=Link]').disable();
                            break;
                        case '1':
                            win.down('textfield[name=Link]').enable();
                            break;
                        default:
                    }
                }
            },
            items: [{
                xtype: 'radio',
                boxLabel: '编写帮助',
                inputValue: '0',
                name: 'WriteHelp',
                value: '0'
            }, {
                xtype: 'radio',
                boxLabel: '指向链接',
                inputValue: '1',
                name: 'WriteHelp',
                value: '1'
            }]
        }, {
            xtype: 'textfield',
            fieldLabel: '链接',
            msgTarget: 'side',
            width: 370,
            name: 'Link'
        }]
    },
    buttons: [{
        iconCls: 'add',
        text: '保存',
        action: 'SaveHelp'
    }, {
        iconCls: 'cancel',
        text: '取消',
        handler: function () {
            this.up('window').close();
        }
    }]
});