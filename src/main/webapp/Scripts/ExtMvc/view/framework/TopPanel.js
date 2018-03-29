Ext.define('SinoydFramework.view.framework.TopPanel', {
    extend: 'Ext.panel.Panel',
    region: 'north',
    alias: 'widget.frameworkTopPanel',
    border: false,
    height: 42,
    bodyCls: 'topViewCell-nobackgroundcolor',
    html: '<div id="divHeader">' +
        '<div class="divCenter">' +
            '<div class="divLeft" style="text-align: right;">' +
             '<div class="UserName">' +
                '欢迎,' + CurrentUser.CName + '!</div>' +
            '</div>' +
             '<div class="divHeadRight">' +
                '</div>' +

    //                '<div id="div1" style="right: 25px; height: 20px; position: absolute;z-index:200;">' +
    //                    '<input type="button" class="Lightblue" onclick="Lightblue()" />'+
    //                    '<input type="button" class="Silvergray" onclick="Silvergray()" />'+
    //                    '<input type="button" class="Deepcolor" onclick="Deepcolor()" />'+
    //                '</div>'+
                '<div id="div2" style="margin-top: 8px; right: 5px; height: 28px; position: absolute;">' +
                        '<table style="font-size: 12px;font-weight:bold; height: 100%; color:Black;"><tr> <td style="width:40px;" ><a href="" onclick="Home(this);return false;">首页</a></td>' +
                             '<td style="width:40px;"><a href="" onclick="SZ(this);return false;">设置</a></td><td style="width:40px;">' +
                             '<a href="" onclick="Help();return false;">帮助</a> </td> '+
                                        '<td style="width:40px;"><a href="" onclick="Exit();return false;">注销</a> </td></tr></table>' +
                '</div>' +
            '</div>' +
        '</div>' +
    // '<div class="divButtom">'+
        '</div>' +
    '</div>',
    initComponent: function () {
        this.callParent(arguments);
    }
});
