Ext.define('SinoydFramework.view.framework.NavigationTree', {
    extend: 'Ext.tree.Panel',
    region: 'west',
    alias: 'widget.frameworkNavigationTree',
    collapsible: true,
    //collapseMode: 'mini',
    collapsed: true,
    autoScroll:true,
    //split: true,
    title: '导航栏',
    width: 220,
    lines: false,
    //bodyCls: 'treeViewCell-nobackgroundcolor',
    store: 'framework.Navigation',
    rootVisible: false,
    initComponent: function () {
        this.callParent(arguments);
    }
})