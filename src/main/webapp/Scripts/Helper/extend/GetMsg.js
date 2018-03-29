Ext.onReady(function () {
    var task = {
        run: function () {
            if (CurrentUser.GetNoReadMsgCountUrl != '') {
                Ext.Ajax.request({
                    url: CurrentUser.GetNoReadMsgCountUrl,
                    success: function (response) {
                        var result = Ext.JSON.decode(response.responseText);
                        if (result.success) {
                            var _win = new Ext.Window({
                                shadow: false, //去掉边框
                                title: '消息',
                                width: 220,
                                height: 120,
                                html: '<div align="center"><br/><br/>您有' + result.data + '条未读消息!</div>',
                                closeAction: 'hide'
                            });
                            _win.show();
                            _win.getEl().alignTo(Ext.getBody(), 'br-br');
                            // 元素从视图中滑出
                            _win.getEl().slideIn('b', {
                                easing: 'easeOut',
                                duration: 3000
                            });
                            setTimeout(function () {
                                _win.getEl().slideOut('b', {
                                    easing: 'easeOut',
                                    duration: 3000
                                });
                            }, 5000);
                        }
                        else {
                            var _win = new Ext.Window({
                                shadow: false, //去掉边框
                                title: '消息',
                                //border:false,
                                width: 220,
                                height: 120,
                                html: '<div align="center"><br/><br/>您没有新的消息!</div>',
                                closeAction: 'hide'
                            });
                            _win.show();
                            _win.getEl().alignTo(Ext.getBody(), 'br-br');
                            // 元素从视图中滑出
                            _win.getEl().slideIn('b', {
                                easing: 'easeOut',
                                duration: 3000
                            });
                            setTimeout(function () {
                                _win.getEl().slideOut('b', {
                                    easing: 'easeOut',
                                    duration: 3000
                                });
                            }, 5000);
                        }
                    }
                });
            }
        },
        interval: 300000 //5 分钟
    }
    Ext.TaskManager.start(task);
});