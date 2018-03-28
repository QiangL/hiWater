function VerificationURL(str_url) {
    var theurl = str_url;
    var tomatch = /http:\/\/[A-Za-z0-9\.-]{3,}\.[A-Za-z]{3}/
    if (tomatch.test(theurl)) {
        return true;
    }
    else {
        return false;
    }
}