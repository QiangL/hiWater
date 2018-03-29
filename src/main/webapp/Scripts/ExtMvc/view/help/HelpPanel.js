Ext.define('SinoydFramework.view.help.HelpPanel', {
    extend: 'Ext.panel.Panel',
    layout: 'border',
    border: false,
    iconCls: 'application',
    alias: 'widget.helpHelpPanel',
    initComponent: function () {
        this.items = [
            Ext.create('SinoydFramework.view.help.HelpTree', {
                region: 'west',
                padding: '5 0 5 5',
                border: true
            }),
            Ext.create('SinoydFramework.view.help.HelpDetailPanel', {
                region: 'center',
                padding: '5 5 5 0',
                border: true,
                layout: 'fit'
            })
        ],
        this.callParent(arguments);
    }
})