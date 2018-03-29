Ext.Loader.setConfig({ enabled: true });
Ext.QuickTips.init();
Ext.Ajax.disableCaching = false;
var SinoydFrameworkApplication;
Ext.application({
    name: 'SinoydFramework',
    appFolder: UrlConvert('Scripts/ExtMvc'),
    controllers: ['Framework', 'Help'],
    launch: function () {
        SinoydFrameworkApplication = this;
        //考勤登记
//        Ext.Ajax.request({
//            url: Application.SignInAttendance,
//            method: 'GET',
//            callback: function (options, success, response) {
//                if (!success) {
//                    Ext.Msg.alert('提示', '考勤登记失败！');
//                }
//            }
//        });
        Ext.create('Ext.container.Viewport', {
            layout: 'border',
            items: [
            Ext.create('SinoydFramework.view.framework.TopPanel'),
            Ext.create('SinoydFramework.view.framework.NavigationTree'),
            Ext.create('SinoydFramework.view.framework.BottomPanel'),
            Ext.create('Ext.tab.Panel', {
                id: 'FrameworkTabPanel',
                basecls: '.x-nlg .x-tab-bar',
                cls: 'tabPanelTitle_bg',
                region: 'center',
                xtype: 'tabpanel'
            })
            ]
        });
    }
});