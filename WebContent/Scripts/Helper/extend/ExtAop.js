Ext.override(Ext.data.Connection, {
    onComplete: function (request) {
        var me = this,
            options = request.options,
            result,
            success,
            response;

        try {
            result = me.parseStatus(request.xhr.status);
        } catch (e) {
            // in some browsers we can't access the status if the readyState is not 4, so the request has failed
            result = {
                success: false,
                isException: false
            };
        }
        success = result.success;
        if (success) {
            response = me.createResponse(request);
            me.sinoydAopMsgForComplete(response); ////////////////sinoyd
            me.fireEvent('requestcomplete', me, response, options);
            Ext.callback(options.success, options.scope, [response, options]);

        } else {
            if (result.isException || request.aborted || request.timedout) {
                response = me.createException(request);
            } else {
                response = me.createResponse(request);
            }
            me.fireEvent('requestexception', me, response, options);
            Ext.callback(options.failure, options.scope, [response, options]);
            Ext.Msg.alert('加载失败', '原因可能是：<br />1、服务不可用<br/>2、地址未找到<br/>3、网络不通');
        }
        Ext.callback(options.callback, options.scope, [options, success, response]);
        delete me.requests[request.id];
        return response;
    },
    sinoydAopMsgForComplete: function (response) {
        try {
            var responseJson = Ext.JSON.decode(response.responseText, true)
            if (responseJson == null) {
                window.location = UrlConvert("Access/Logout");
                return;
            }

            if (responseJson.success) {
                return;
            }
            //执行成功，不做任何处理
            switch (responseJson.failureCode) {
                case -1: //-1  没有权限
                    Ext.Msg.alert('权限验证失败', '请检查权限列表');
                    break;
                case 1: //1   用户不在线
                    Ext.Msg.alert('在线验证失败', '请检查是否在线', function () {
                        window.location = UrlConvert("Access/Logout");
                    });
                    break;
                case -2:
                    Ext.Msg.alert('错误', '程序发生异常，现场已经保存，请联系负责人');
                    break;
                default:
                    break;
            }
        }
        catch (e) {
            return;
        }
    }
})






