<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="shortcut icon" href="http://www.google.com/favicon.ico" />
<link href="/hiWater/Content/Themes/Common/css/Main.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<script src="/hiWater/Scripts/Extjs4/ext-all.js"
		type="text/javascript"></script>

	<script src="/hiWater/Scripts/Helper/utils/UrlConvert.js"
		type="text/javascript"></script>
	<script src="/hiWater/Content/Themes/Common/images/swfobject.js"
		type="text/javascript"></script>
	<style type="text/css">
html, body {
	width: 100%;
	height: 100%;
	overflow: hidden;
	background-color: White;
}

* {
	margin: 0px;
	padding: 0px;
	border: 0px;
}

body {
	text-align: center;
	font-size: 12px;
	line-height: normal;
	font-family: "宋体";
	font-weight: normal;
	padding: 0;
	margin: 0;
}

div {
	height: 100%;
}
</style>
	<div class="my_mid">

		<div
			style="height: 365px; position: absolute; top: 280px; left: 477px; width: 457px; clear: both; margin-top: 0px; margin-left: 0px;">
			<table cellspacing="5" cellpadding="5">
				<tr>
					<td align="right">
						<div class="tdLoginUser" style="margin-top: 5px"></div>
					</td>
					<td valign="top"><input type="text" id="txtName"
						runat="server" class="TextBoxStyle" tabindex="1" /></td>
					<td valign="top" rowspan="2"><input type="button"
						name="LoginBtn" id="LoginBtn" onclick="btnLogin_Click()"
						onmouseout="mouseoutLogin(this)"
						onmouseover="mouseoverLogin(this)" class="LoginBtn" tabindex="3" />
					</td>
				</tr>
				<tr>
					<td align="right">
						<div class="tdLoginPwd" style="margin-top: 5px"></div>
					</td>
					<td valign="top"><input type="password" id="txtPsw"
						runat="server" class="TextBoxStyle" tabindex="2" /></td>

				</tr>
			</table>
		</div>
	</div>
	<div class="my_left">
		<div class="container"></div>
	</div>
	<div class="my_right">
		<div class="container"></div>
	</div>
	<script type="text/javascript">
		if (top.location != window.location) {
			top.location.reload();
		}
		var Application = {};
		Application.ApplicationPath = 'http' + '://' + '127.0.0.1:8080'
				+ '/hiWater';
		var url = '/hiWater';
		var url = '/hiWater';
		var usr = GetCookie("uname");
		//var pwd = GetCookie("upwd");
		if (usr != null) {
			document.getElementById("txtName").value = usr;
		} else {
			document.getElementById("txtName").value = "";
		}
		//if (pwd != null) {
		//document.getElementById("txtPsw").value = pwd;
		//}
		//else {
		document.getElementById("txtPsw").value = "";
		//}
		function mouseoutLogin(obj) {
			//obj.src = obj.src.replace('_mov', '_nrm');

			obj.className = "LoginBtn"
		}
		function mouseoverLogin(obj) {
			//obj.src = obj.src.replace('_nrm', '_mov');
			//obj.style.cursor='hand'";
			obj.className = "LoginBtnOver"
		}
		function mouseoutReset(obj) {
			//obj.src = obj.src.replace('_mov', '_nrm');
			obj.className = "ResetBtn"
		}
		function mouseoverReset(obj) {
			//obj.src = obj.src.replace('_nrm', '_mov');
			obj.className = "ResetBtnOver"
		}
		function btnLogin_Click() {
			var Name = document.getElementById("txtName").value;
			var Psw = document.getElementById("txtPsw").value;
			var expdate = new Date();
			//当前时间加上两周的时间  
			expdate.setTime(expdate.getTime() + 14 * (24 * 60 * 60 * 1000));
			SetCookie("uname", Name, expdate);
			SetCookie("upwd", Psw, expdate);
			//	alert(UrlConvert("logina"));
			//	alert(Application.ApplicationPath);
			Ext.Ajax.request({
				url : UrlConvert("login?"),
				method : 'POST',
				useDefaultXhrHeader : false,
				params : {
					user : Name,
					pwd : Psw,
					url : url
				},
				success : function(response, options) {
					var obj = Ext.JSON.decode(response.responseText);
					if (obj.success) {
						window.location.href = obj.data;
					} else {
						alert(obj.msg);
						// Ext.Msg.alert("消息", obj.msg);
					}
				},
				failure : function(response, options) {
					console.log('server-side failure with status code '
							+ response.status);
				}
			});
		}
		//取Cookie的值  
		function GetCookie(name) {
			var arg = name + "=";
			var alen = arg.length;
			var clen = document.cookie.length;
			var i = 0;
			while (i < clen) {
				var j = i + alen;
				//alert(j);  
				if (document.cookie.substring(i, j) == arg)
					return getCookieVal(j);
				i = document.cookie.indexOf(" ", i) + 1;
				if (i == 0)
					break;
			}
			return null;
		}
		function getCookieVal(offset) {
			var endstr = document.cookie.indexOf(";", offset);
			if (endstr == -1)
				endstr = document.cookie.length;
			return unescape(document.cookie.substring(offset, endstr));
		}
		//写入到Cookie  
		function SetCookie(name, value, expires) {
			var argv = SetCookie.arguments;
			var argc = SetCookie.arguments.length;
			var expires = (argc > 2) ? argv[2] : null;
			var path = (argc > 3) ? argv[3] : null;
			var domain = (argc > 4) ? argv[4] : null;
			var secure = (argc > 5) ? argv[5] : false;
			document.cookie = name
					+ "="
					+ escape(value)
					+ ((expires == null) ? "" : ("; expires=" + expires
							.toGMTString()))
					+ ((path == null) ? "" : ("; path=" + path))
					+ ((domain == null) ? "" : ("; domain=" + domain))
					+ ((secure == true) ? "; secure" : "");
		}

		function btnReset_Click() {
			document.getElementById("txtName").value = "";
			document.getElementById("txtPsw").value = "";
		}

		function check(obj) {
			if (obj.checked) {

			} else {
			}
		}

		function PassWordKey(e) {
			if (e.KeyCode == Keys.Enter)
				LoginBtn.btnLogin_Click();
		}

		//这个就是键盘触发的函数

		var SubmitOrHidden = function(evt) {

			evt = window.event || evt;

			if (evt.keyCode == 13) {//如果取到的键值是回车  
				//document.getElementById("LoginBtn").focus();
				btnLogin_Click();

			} else {

				//其他键  dosomething  

			}

		}

		window.document.onkeydown = SubmitOrHidden; //当有键按下时执行函数  
		//    var f4 = new SWFObject('/SHWRY/Content/Themes/Common/images/loginRun.swf', "swfId", "100%", "100%", "8", "#000", true);

		//    f4.addParam('allowScriptAccess', 'sameDomain');
		//    f4.addParam('allowFullScreen', 'false');
		//    f4.addParam('quality', 'high');
		//    f4.addParam('wmode', 'transparent');
		//    f4.addParam('bgcolor', '#ffffff');
		//f4.write("flvPlayerDivId");
	</script>

	<div class="divCenterTop">
		<div class="divCenterDown" onclick="javascript:UpDown(this)"></div>
	</div>
</body>
</html>