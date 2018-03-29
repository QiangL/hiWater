
Ext.define('SinoydFramework.controller.MyPortal', {
    extend: 'Ext.app.Controller',
    stores: ['portal.Portal', 'portal.PortalItem'],
    models: ['portal.Portal', 'portal.PortalItem'],
    views: ['SinoydFramework.view.portal.Portal',
            'SinoydFramework.view.portal.PortalColumn',
            'SinoydFramework.view.portal.PortalPanel',
            'SinoydFramework.view.portal.Portlet',
            'SinoydFramework.view.portal.PortalDropZone'
            ],

    init: function () {
    	console.log("init~init~oh~yeah");
        this.control({
            'portalPortal button[action=save]': {
                //保存首页布局
                click: function (obj, event) {
                    var columns = obj.up('panel').items.items[0];
                    var portletJson = [];
                    for (var i = 0; i < columns.items.length; i++) {
                        var portlets = columns.items.items[i];
                        for (var j = 0; j < portlets.items.length; j++) {
                            portletJson.push({ "Id": portlets.items.items[j].items.items[0].id, "ColIndex": i, "OrderNum": j }); // "{" + portlets[j].title + "},";
                        }
                    }

                    Ext.Ajax.request({
                        url: UrlConvert('Portal/SaveMyPortal'),
                        params: {
                            data: Ext.encode(portletJson)
                        },
                        method: 'POST',
                        callback: function (options, success, response) {
                            if (success) {
                                var obj = Ext.JSON.decode(response.responseText);
                                Ext.Msg.alert('提示', obj.msg);
                            } else {
                                var obj = Ext.JSON.decode(response.responseText);
                                Ext.Msg.alert('错误', obj.msg);
                            }
                        }
                    });
                }
            }
        });
    },

    initView: function () {
        var app = this.application;
        portal = Ext.create('SinoydFramework.view.portal.Portal');
        var portalpanel = portal.items.items[0];
        portalpanel.add({   // 添加一列
            border: false,
            id: 'col-0',
            columnWidth: 1,
            items: []
        });
        Ext.Ajax.request({
            url: UrlConvert('Portal/GetPortalByUserId'),
            params: {
                Id: CurrentUser.Id
            },
            method: 'GET',
            callback: function (options, success, response) {
                if (success) {
                    var rec = Ext.decode(response.responseText);
                    if (rec.success) {
                        var widths = rec.data.Widths.split('.');
                        // 第一列的宽度和边框
                        portalpanel.items.items[0].columnWidth = widths[1] / 100;
                        // 添加其它列
                        for (var i = 1; i < rec.data.ColumnWidths; i++) {
                            portalpanel.add({
                                border: false,
                                id: 'col-' + i,
                                columnWidth: widths[i + 1] / 100,
                                items: []
                            });
                        }
                        Ext.Ajax.request({
                            url: UrlConvert('Portal/GetPortalItemByPortalPanel'),
                            params: {
                                portalId: rec.data.Id
                            },
                            method: 'GET',
                            callback: function (options, success, response) {
                                if (success) {
                                    obj = Ext.decode(response.responseText);
                                    num = obj.extraData;
                                    var item;
                                    for (var i = 0; i < num; i++) {
                                        try {
                                            col = obj.data[i].ColIndex;
                                            // 元素的列序号超出列数，则忽略
                                            // 元素的地址为空,则忽略
                                            if (col < portalpanel.items.length && obj.data[i].Url.length > 0 && obj.data[i].Visiable) {
                                                if (obj.data[i].Url.split('//')[0] == 'http:') {
                                                    item = Ext.create('Ext.panel.Panel', {
                                                        layout: 'fit',
                                                        border: false,
                                                        height: obj.data[i].Height,
                                                        html: '<iframe frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="yes" allowtransparency="yes"  src="'
                                    + obj.data[i].Url + '" width="100%" height="100%" ></iframe>'
                                                    });
                                                    // 添加其它列中的元素
                                                    portalpanel.items.items[col].add({
                                                        title: obj.data[i].Name,
                                                        border: false,
                                                        items: item
                                                    });
                                                }
                                                else {
                                                    //获得controller
                                                    var rout = obj.data[i].Url.split('/');
                                                    var c = null;
                                                    for (var j = 0; j < app.controllers.length; j++) {
                                                        if (rout[0] === app.controllers.items[j].id) {
                                                            c = app.controllers.items[j];
                                                        }
                                                    }
                                                    if (!c) {
                                                        c = app.getController(rout[0]);
                                                        c.init();
                                                    }
                                                    item = eval("c." + rout[1] + "()");
                                                    item.setTitle('');
                                                    // 添加其它列中的元素
                                                    portalpanel.items.items[col].add({
                                                        title: obj.data[i].Name,
                                                        border: false,
                                                        height: obj.data[i].Height,
                                                        items: item
                                                    });
                                                }
                                            }
                                        } catch (e) {
                                            item = Ext.create('Ext.panel.Panel', {
                                                layout: 'fit',
                                                border: false,
                                                height: obj.data[i].Height,
                                                html: '<iframe frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="yes" allowtransparency="yes"  src="'
                                    + obj.data[i].Url + '" width="100%" height="100%" ></iframe>'
                                            });
                                            // 添加其它列中的元素
                                            portalpanel.items.items[col].add({
                                                title: obj.data[i].Name,
                                                border: false,
                                                items: item
                                            });
                                        }
                                    }
                                } else {
                                    var obj = Ext.JSON.decode(response.responseText);
                                    Ext.Msg.alert('错误', obj.msg);
                                }
                            }

                        });
                    }
                }
            }
        });
        return portal;
    },
    // 显示时钟
    showClock: function () {
        var panel = Ext.create('Ext.panel.Panel', {
            bodyStyle: {
                padding: '10px'
            },
            items: [{
                xtype: 'label',
                forId: 'time',
                margins: '0 0 0 10'
            }]
        });
        var MyPortal = this;
        Ext.Ajax.request({
            url: UrlConvert('Portal/GetCurrentTime'),
            method: 'GET',
            callback: function (options, success, response) {
                if (success) {
                    var rec = Ext.decode(response.responseText);
                    if (rec.success) {
                        panel.currentTime = new Date(parseInt(rec.data.replace("/Date(", "").replace(")/", "")));
                        clockPanel = panel;
                        // 在setInterval方法中的参数 showTime(),clockPanel 必须是全局的
                        // 放在../../SinoydHelper/utils/MyPortalClockPanel.js中
                        setInterval(function () { showTime(clockPanel); }, 2000);
                    }
                }
            }
        });
        return panel;
    }
});



