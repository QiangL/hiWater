Ext.define('SinoydFramework.controller.Help', {
    extend: 'Ext.app.Controller',
    stores: ['help.HelpTree'],
    views: ['help.HelpPanel', 'help.HelpTree', 'help.HelpDetailPanel', 'help.HelpFormWindow', 'help.HelpContentForm'],
    init: function () {
        this.control({
            'helpHelpFormWindow button[action=SaveHelp]': {
                click: function (obj, event) {
                    var win = obj.up('window');
                    var url = win.operatorMode == "add" ? "Help/AddHelp" : "Help/UpdateHelp";
                    var id = win.down('hidden[name=Id]').getValue();
                    var parentId = win.down('hidden[name=ParentID]').getValue();
                    var title = win.down('textfield[name=Name]').getValue();
                    var mode = win.down('radiogroup[name=AddMode]').getValue().WriteHelp;
                    var staticUrl = (mode != "1" ? "" : win.down('textfield[name=Link]').getValue());

                    if (title == "") {
                        Ext.MessageBox.alert('提示', '标题不能为空');
                    }
                    else {
                        Ext.Ajax.request({
                            url: UrlConvert(url),
                            params: {
                                id: id,
                                parentId: parentId,
                                title: title,
                                mode: mode,
                                staticUrl: staticUrl
                            },
                            success: function (resp, opts) {
                                win.close();
                                var rec = Ext.JSON.decode(resp.responseText);
                                var parentNode = win.selectTreeNode;
                                if (rec.data.operatorType == 'add') {
                                    var nownode = ({
                                        text: win.down('textfield[name=Name]').getValue(),
                                        id: rec.data.nodeId,
                                        leaf: true,
                                        allowDrag: true,
                                        allowDrop: true
                                    });
                                    parentNode.set("leaf", false);
                                    parentNode.set("expanded", true);
                                    parentNode.set("expandable", true);
                                    parentNode.insertChild(0, nownode);
                                }
                                else {
                                    var selectnode = parentNode;
                                    selectnode.data.text = win.down('textfield[name=Name]').getValue();
                                    if (selectnode.data.leaf) {
                                        var parentNode = selectnode.parentNode;
                                        parentNode.collapse();
                                        parentNode.expand();
                                    }
                                    else {
                                        if (selectnode.data.expanded == true) {
                                            selectnode.collapse();
                                        }
                                        else {
                                            selectnode.expand();
                                        }
                                    }
                                }
                            },
                            failure: function (response) {
                                Ext.MessageBox.alert('失败', '请求超时或网络故障,错误编号：' + response.status);
                            }
                        });
                    }
                }
            },
            'helpHelpTree': {
                itemclick: function (view, record, item, index) {
                    var panelDetail = view.up().next();
                    Ext.Ajax.request({
                        url: UrlConvert('Help/GetHelp'),
                        params: {
                            helpId: record.data.id
                        },
                        success: function (resp, opts) {
                            var rec = Ext.JSON.decode(resp.responseText);
                            if (panelDetail.items.length != 0) {
                                panelDetail.removeAll(true);
                            }
                            var tab;
                            switch (rec.data.Mode) {
                                //显示静态页面                                                                                
                                case 1:
                                    if (!(VerificationURL(rec.data.StaticUrl))) {
                                        tab = Ext.create('Ext.panel.Panel', {
                                            autoScroll: false,
                                            layout: 'fit',
                                            border: false,
                                            closable: true,
                                            autoScroll: 'auto',
                                            bodyStyle: { overflow: 'hide' },
                                            html: '您配置的' + rec.data.StaticUrl + '不是正确的网址，无法显示！',
                                            title: '详细信息'
                                        });
                                    }
                                    else {
                                        tab = Ext.create('Ext.panel.Panel', {
                                            autoScroll: false,
                                            layout: 'fit',
                                            border: false,
                                            closable: true,
                                            autoScroll: 'auto',
                                            bodyStyle: { overflow: 'hide' },
                                            html: '<iframe frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="no" allowtransparency="yes"  src="'
                            + rec.data.StaticUrl + '" width="100%" height="100%" ></iframe>',
                                            title: '详细信息'
                                        });
                                    }
                                    panelDetail.add(tab);
                                    break;
                                //显示数据库中读取内容                                                                                    
                                case 0:
                                    tab = Ext.create('Ext.panel.Panel', {
                                        autoScroll: 'auto',
                                        layout: 'fit',
                                        border: false,
                                        tbar: new Ext.Toolbar({
                                            autoWidth: true,
                                            autoShow: true,
                                            items: [{
                                                iconCls: 'application_edit',
                                                text: '编辑',
                                                action: 'EditText',
                                                handler: function (obj, event) {
                                                    var helpContent = rec.data.Text;
                                                    var win = Ext.create('Ext.window.Window', {
                                                        iconCls: 'application',
                                                        title: '详细内容',
                                                        height: 340,
                                                        modal: true,
                                                        border: false,
                                                        width: 560,
                                                        layout: 'fit',
                                                        items: Ext.create('SinoydFramework.view.help.HelpContentForm'),
                                                        buttons: [{
                                                            text: '保存',
                                                            iconCls: 'add',
                                                            handler: function (obj, event) {
                                                                var htmleditor = obj.up().up().down('textareafield[name=HelpContent]')
                                                                var textarea = htmleditor.getEl().dom.childNodes[1].childNodes[0];
                                                                $('#' + textarea.id).val(); //如果不执行此步骤，则htmleditor取不到值，原因不详
                                                                var htmlDeCode = Ext.util.Format.htmlEncode(htmleditor.getValue()); //将htmleditor内容进行html编码
                                                                Ext.Ajax.request({
                                                                    url: UrlConvert('Help/UpdateHelpWithContent'),
                                                                    params: {
                                                                        helpId: rec.data.Id,
                                                                        content: htmlDeCode
                                                                    },
                                                                    success: function (resp, opts) {
                                                                        var rec = Ext.JSON.decode(resp.responseText);
                                                                        obj.up('window').close();
                                                                        Ext.MessageBox.alert('提示', rec.msg);
                                                                        var list = Ext.ComponentQuery.query('helpHelpDetailPanel')[0];
                                                                        //obj.up().down('textareafield[name=HelpContent]').setValue(htmlDeCode);
                                                                    },
                                                                    failure: function (response) {
                                                                        Ext.MessageBox.alert('失败', '请求超时或网络故障,错误编号：' + response.status);
                                                                    }
                                                                });
                                                            }
                                                        }, {
                                                            text: '取消',
                                                            iconCls: 'delete',
                                                            handler: function () {
                                                                this.up('window').close();
                                                            }
                                                        }]
                                                    });
                                                    win.down('textareafield[name=HelpContent]').setValue(Ext.util.Format.htmlDecode(helpContent));
                                                    win.show();

                                                }
                                            }]
                                        }),
                                        closable: true,
                                        bodyStyle: { overflow: 'hide' },
                                        html: Ext.util.Format.htmlDecode(rec.data.Text),
                                        title: '详细信息'
                                    });
                                    panelDetail.add(tab);
                                    break;
                                default:
                                    break;
                            }
                        },
                        failure: function (response) {
                            Ext.MessageBox.alert('失败', '请求超时或网络故障,错误编号：' + response.status);
                        }
                    });
                },
                itemcontextmenu: function (tree, record, item, index, e, options) {
                    var menu = tree.ownerCt.Menu;
                    if (menu) {
                        e.preventDefault();
                        menu.params = {};
                        menu.params.tree = tree;
                        menu.params.record = record;
                        menu.params.item = item;
                        menu.params.index = index;
                        menu.showAt(e.getXY());
                    }
                },
                menuClick: function (menuobj, event, command) {
                    switch (command) {
                        case 'addHelp':
                            var win = Ext.create('SinoydFramework.view.help.HelpFormWindow');
                            win.selectTreeNode = menuobj.ownerCt.params.record;
                            win.down('radiogroup[name=AddMode]').items.items[0].setValue(true);
                            win.down('hidden[name=Id]').setValue("");
                            win.operatorMode = "add";
                            win.down('hidden[name=ParentID]').setValue(menuobj.up().params.record.data.id);
                            win.down('textfield[name=Link]').disable();
                            win.setTitle("新增帮助");
                            win.show();
                            break;
                        case 'editHelp':
                            Ext.Ajax.request({
                                url: UrlConvert('Help/GetHelp'),
                                params: {
                                    helpId: menuobj.up().params.record.data.id
                                },
                                success: function (resp, opts) {
                                    var rec = Ext.JSON.decode(resp.responseText);
                                    var winHelp = Ext.create('SinoydFramework.view.help.HelpFormWindow');
                                    winHelp.selectTreeNode = menuobj.ownerCt.params.record;
                                    winHelp.down('hidden[name=Id]').setValue(rec.data.Id);
                                    winHelp.down('hidden[name=ParentID]').setValue(rec.data.ParentId);
                                    winHelp.down('textfield[name=Name]').setValue(rec.data.Title);
                                    winHelp.down('radiogroup[name=AddMode]').items.items[rec.data.Mode].setValue(true);
                                    winHelp.operatorMode = "edit";
                                    switch (rec.data.Mode) {
                                        case 0:
                                            winHelp.down('textfield[name=Link]').disable();
                                            break;
                                        case 1:
                                            winHelp.down('textfield[name=Link]').enable();
                                            break;
                                        default:

                                    }
                                    winHelp.down('textfield[name=Link]').setValue(rec.data.StaticUrl);
                                    winHelp.setTitle("修改帮助");
                                    winHelp.show();
                                },
                                failure: function (response) {
                                    Ext.MessageBox.alert('失败', '请求超时或网络故障,错误编号：' + response.status);
                                }
                            });
                            break;
                        case 'deleteHelp':
                            Ext.Msg.show({
                                title: '确认',
                                msg: menuobj.up().params.record.data.leaf ? '你确定要删除' + menuobj.up().params.record.data.text + '吗?' : '你确定要删除' + menuobj.up().params.record.data.text + '吗?,系统将该帮助下的子项全部删除',
                                buttons: Ext.Msg.YESNO,
                                icon: Ext.Msg.QUESTION,
                                fn: function (btn) {
                                    if (btn == 'yes') {
                                        Ext.Ajax.request({
                                            url: UrlConvert('Help/DeleteHelp'),
                                            params: {
                                                helpId: menuobj.up().params.record.data.id
                                            },
                                            success: function (resp, opts) {
                                                var node = menuobj.ownerCt.params.record;
                                                var parentNode = node.parentNode;
                                                parentNode.removeChild(node);
                                                if (parentNode.childNodes.length == 0) {
                                                    parentNode.data.leaf = true
                                                }
                                            },
                                            failure: function (response) {
                                                Ext.MessageBox.alert('失败', '请求超时或网络故障,错误编号：' + response.status);
                                            }
                                        });
                                    }
                                }
                            });
                        default:
                            break;
                    }
                }
            },
            'helpHelpDetailPanel': {
                render: function (obj, eOpts) {
                    var tab = Ext.create('Ext.panel.Panel', {
                        autoScroll: false,
                        layout: 'fit',
                        border: false,
                        closable: true,
                        bodyStyle: { overflow: 'hide' },
                        html: '',
                        title: '详细信息'
                    });
                    obj.add(tab);
                }
            }
        });
    }
})  