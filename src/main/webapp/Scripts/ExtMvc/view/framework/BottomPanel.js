Ext.define('SinoydFramework.view.framework.BottomPanel', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.frameworkBottomPanel',
    region: 'south',
    height: 22,
    border: false,
    html: '<div class="divButtomAll"><div style=" text-align:center;padding-top:5px;"> ' +
            'CopyRight@2012:上海市环境监测中心 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 技术支持：江苏远大信息股份有限公司'+
           '</div></div>',
    initComponent: function () {
        this.callParent(arguments);
    }
//    initComponent: function () {
//        this.bbar = [{
//            xtype: 'button',
//            text: 'Show Warning & Clear',
//            handler: function () {
//                var sb = Ext.getCmp('basic-statusbar');
//                sb.setStatus({
//                    text: 'Oops!',
//                    iconCls: 'x-status-error',
//                    clear: true // auto-clear after a set interval
//                });
//            }
//        },
//                '-',
//                'Plain Text'];
//        this.callParent(arguments);
//    }
})