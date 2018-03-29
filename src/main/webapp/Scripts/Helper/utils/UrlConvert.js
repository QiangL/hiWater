//作者：陆雷
//时间：2012-3-21
//功能：把项目文件地址转换成网络地址
//说明：在Framework/Index页面上必须保留Application.ApplicationPath的变量
function UrlConvert(url) {
    if (typeof Application.ApplicationPath != "undefined" && Application.ApplicationPath != undefined && Application.ApplicationPath != null && Application.ApplicationPath != '') {
        if (Application.ApplicationPath.lastIndexOf('/') != Application.ApplicationPath.length - 1)
        { Application.ApplicationPath += '/'; }
        return Application.ApplicationPath + url;
    }
    else {
        var requestUrlarr = document.location.href.replace('//', '/').split('/');
        var requestUrl = '';
        if (requestUrlarr.length >= 3) {
            requestUrl = requestUrlarr[1] + '/' + requestUrlarr[2] + '/';
            requestUrl = requestUrl.replace('//', '/');
            requestUrl = requestUrlarr[0] + '//' + requestUrl;
        }
        else {//数组长度只能是2，eg:http://127.0.0.0;
            requestUrl = document.location.href;
            if (requestUrl.lastIndexOf('/') != requestUrl.length - 1)
                requestUrl += '/';
        }
        requestUrlarr = null;
        return requestUrl + url;
    }
}
