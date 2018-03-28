Ext.define('SinoydFramework.store.help.HelpTree', {
    extend: 'Ext.data.TreeStore',
    autoLoad: true,
    proxy: {
        type: 'ajax',
        url: UrlConvert('Help/Get'),
        reader: {
            type: 'json',
            root: 'data',
            successProperty: 'success'
        }
    },
    root:
    {
        id: '00000000-0000-0000-0000-00000000000',
        text: '导航',
        expanded: true
    }
});