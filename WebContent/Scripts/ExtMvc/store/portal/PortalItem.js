Ext.define('SinoydFramework.store.portal.PortalItem', {
    extend: 'Ext.data.Store',
    model: 'SinoydFramework.model.portal.PortalItem',
    autoLoad: false, 
    proxy: {
        type: 'ajax',
        api: {
            read: UrlConvert('Portal/GetPortalItemByPortal')
        },
        reader: {
            type: 'json',
            root: 'data',
            successProperty: 'success'
        }
    }
});
