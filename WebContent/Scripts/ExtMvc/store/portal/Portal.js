Ext.define('SinoydFramework.store.portal.Portal', {
    extend: 'Ext.data.Store',
    model: 'SinoydFramework.model.portal.Portal',
    autoLoad: false,
    proxy: {
        type: 'ajax',
        api: {
            read: UrlConvert('Portal/GetAll')
        },
        reader: {
            type: 'json',
            root: 'data',
            successProperty: 'success'
        }
    }
});
