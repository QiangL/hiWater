Ext.define('SinoydFramework.model.portal.PortalItem', {
    extend: 'Ext.data.Model',
    fields: [
    { name: 'Id', type: 'string' },
    { name: 'PortalId', type: 'string' },
    { name: 'ColIndex', type: 'string' },
    { name: 'OrderNum', type: 'string' },
    { name: 'ModuleId', type: 'string' },
    { name: 'ApplicationPath', type: 'string' },
    { name: 'Visiable', type: 'bool' },
    { name: 'Name', type: 'string' },
    { name: 'Url', type: 'string' },
    { name: 'Icon', type: 'string' },
    { name: 'Height', type: 'int' }
    ]
});