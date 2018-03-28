Ext.define('SinoydFramework.store.framework.Navigation', {
    extend: 'Ext.data.TreeStore',
    autoLoad: false,
    proxy: {
        type: 'ajax',
        url: '',
        reader: {
            type: 'json',
            root: 'children',
            successProperty: 'success'
        }
    },
    root: {
        expanded: true,
        loaded: true,
        children: [],
        allowDrag: false,
        allowDrop: false
    }
});