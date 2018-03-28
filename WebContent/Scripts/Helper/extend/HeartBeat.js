Ext.onReady(function () {
    try {
        Ext.Ajax.request({
            url: UrlConvert('Application/GetAllHeartbeatUrls'),
            method: 'GET',
            callback: function (options, success, response) {
                if (success) {
                    var obj = Ext.JSON.decode(response.responseText);
                    var heartbeatUrls = obj.data;
                    window.setInterval(function () {
                        for (var i = 0; i < heartbeatUrls.length; i++) {
                            Ext.Ajax.request({
                                url: heartbeatUrls[i],
                                method: 'GET'
                            });
                        }
                    }, 5 * 60 * 1000); // 单位毫秒
                } else {
                    var obj = Ext.JSON.decode(response.responseText);
                    Ext.Msg.alert('错误', obj.msg);
                }
            }
        });
    }
    catch (e) {
    }
});