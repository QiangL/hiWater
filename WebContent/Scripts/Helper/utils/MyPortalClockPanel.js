var clockPanel;
function showTime(panel) {
    var time;
    if (panel && panel.currentTime) {
        time = panel.currentTime;
    }
    else {
        time = new Date();
    }
    hours = time.getHours();
    minutes = time.getMinutes();
    seconds = time.getSeconds();
    year = time.getFullYear();
    month = time.getMonth() + 1;
    date = time.getDate();
    day = time.getDay();
    dayArray = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
    // 如果分或秒是个位数，则在十位补0
    if (minutes <= 9)
        minutes = "0" + minutes;
    if (seconds <= 9)
        seconds = "0" + seconds;

    var theTime = "今天是：" + year + "年" + month + "月" + date + "日 "
                     + dayArray[day] + "<br>" + "现在时间：" + hours + ":" + minutes + ":" + seconds;

    // 显示时间label
    panel.items.items[0].setText(theTime, false);
    panel.currentTime.setSeconds(panel.currentTime.getSeconds() + 2);
}