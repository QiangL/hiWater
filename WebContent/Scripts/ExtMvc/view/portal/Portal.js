Ext.define('SinoydFramework.view.portal.Portal', {
    extend: 'Ext.panel.Panel',
    border: false,
    bodyStyle: { overflow: 'auto' },
    alias: 'widget.portalPortal',
    padding: '5 5 5 5',
    initComponent: function () {

        this.items = [{
            xtype: 'portalpanel',
            region: 'center',
            layout: 'border',
            border: false,
            bodyborder: false,
            items: []
        }],

        this.callParent(arguments);
    }
});
