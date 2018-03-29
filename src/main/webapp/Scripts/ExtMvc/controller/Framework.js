Ext.define('SinoydFramework.controller.Framework', {
	extend : 'Ext.app.Controller',
	stores : ['framework.Navigation', 'help.HelpTree'],
	requires : [],
	views : ['framework.NavigationTree', 'framework.BottomPanel',
			'framework.TopPanel'],
	init : function() {
		this.control({
			'frameworkNavigationTree' : {
				// /节点点击事件
				itemclick : this.NavigationTreeItemClick,
				afterrender : function(tree) {
					tree.store.load({
						url : UrlConvert('Navigation/GetAllNodeNavigationByPermission'),
						params : {
							node : CurrentUser.NavigationId
						}
					});
				}
			},
			'frameworkNavigationTree button[action=expandAll]' : {
				click : function(obj, event) {

					obj.up('frameworkNavigationTree').expandAll();
				}
			},
			'frameworkNavigationTree button[action=collapseAll]' : {
				click : function(obj, event) {
					obj.up('frameworkNavigationTree').collapseAll();
				}
			},
			'frameworkNavigationTree button[action=refresh]' : {
				click : function(obj, event) {
					obj.up('frameworkNavigationTree').store.tree.root
							.removeAll();
					obj.up('frameworkNavigationTree').store.load({
						url : UrlConvert('Navigation/GetAllNodeNavigationByPermission'),
						params : {
							node : CurrentUser.NavigationId
						}
					});
				}
			},
			'frameworkTopPanel' : {
				afterrender : function() {
					var tabid = 'MyPortal';
					var TabPanel = Ext.getCmp('FrameworkTabPanel');
					var tab = TabPanel.getComponent(tabid);
					// 加载所需的controller;

					var c;
					for (var i = 0; i < this.application.controllers.length; i++) {
						if ('MyPortal' === this.application.controllers.items[i].id) {
							c = this.application.controllers.items[i];
						}
					}
					if (!c) {
						c = this.application.getController('MyPortal');
						c.init();
						console.log("fffffffff");

					}
					console.log("aaaaaaa");
					tab = Ext.create('Ext.panel.Panel', {
								id : tabid,
								title : '我的首页',
								autoScroll : false,
								layout : 'fit',
								border : false,
								closable : false,
								bodyStyle : {
									overflow : 'auto'
								},
								items : eval("c.initView()")
							});
					TabPanel.add(tab);
					TabPanel.setActiveTab(tab);
					tab.doLayout();
					TabPanel.doLayout();
					TabPanel = null;
					tabid = null;
					tab = null;
				}
			},
			'frameworkTopPanel button[action=LogOff]' : {
				click : function(obj, event) {
					window.location = UrlConvert("Access/Logout");
				}
			},
			'frameworkTopPanel button[action=Help]' : {
				click : function(obj, event) {
					var c = this.application.getController('Help');
					if (c == undefined) {
						c.init();
					}
					var panelHelp = Ext.create('Ext.panel.Panel', {
						autoScroll : false,
						layout : 'fit',
						border : false,
						closable : false,
						width : 830,
						height : 485,
						bodyStyle : {
							overflow : 'hide'
						},
						html : ' <img src="../Content/Themes/Common/images/help.jpg" style="text-align: center; vertical-align: middle;" />'
					});
					// var panelHelp =
					// Ext.create('SinoydFramework.view.help.HelpPanel');
					var win = Ext.create('Ext.window.Window', {
								iconCls : 'application',
								title : '系统帮助',
								height : 500,
								modal : true,
								border : false,
								width : 830,
								layout : 'fit',
								items : panelHelp
							}).show();
				}
			}
		});
	},
	NavigationTreeItemClick : function(view, record, item, index) {
		if (record.data.leaf) {
			// var tabid = ;
			var TabPanel = view.up('viewport').down('tabpanel');
			var tab = TabPanel.getComponent('tab'
					+ record.data.hrefTarget.replace('/', ''))
					|| TabPanel.getComponent('tab' + record.data.id);
			// 该tab不存在,且未达到选项卡上限时,可以新增一个tab
			if (tab == null || tab == undefined) {
				if (TabPanel.items.length < Application.MAXTabCount) {
					if (record.data.hrefTarget.split('//')[0] == 'http:') {
						tab = Ext.create('Ext.panel.Panel', {
							id : 'tab' + record.data.id,
							title : record.data.text,
							autoScroll : false,
							layout : 'fit',
							border : false,
							closable : true,
							bodyStyle : {
								overflow : 'hide'
							},
							html : '<iframe frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="no" allowtransparency="yes"  src="'
									+ record.data.hrefTarget
									+ '" width="100%" height="100%" ></iframe>'
						});

						TabPanel.add(tab);
						TabPanel.setActiveTab(tab);
						TabPanel.doLayout();

						TabPanel = null;
						tabid = null;
						tab = null;
					} else {
						// 加载所需的controller;
						var rout = record.data.hrefTarget.split('/');
						var c;
						for (var i = 0; i < this.application.controllers.length; i++) {
							if (rout[0] === this.application.controllers.items[i].id) {
								c = this.application.controllers.items[i];
							}
						}
						if (!c) {
							c = this.application.getController(rout[0]);
							c.init();
						}
						tab = Ext.create('Ext.panel.Panel', {
									id : 'tab'
											+ record.data.hrefTarget.replace(
													'/', ''),
									title : record.data.text,
									autoScroll : false,
									layout : 'fit',
									border : false,
									closable : true,
									closeAction : 'destroy',
									bodyStyle : {
										overflow : 'hide'
									},
									items : eval("c." + rout[1] + "()")
								});
						TabPanel.add(tab);
						TabPanel.setActiveTab(tab);
						tab.doLayout();
						TabPanel.doLayout();
						TabPanel = null;
						tabid = null;
						tab = null;
					}
				} else {
					Ext.Msg.alert('提示', '选项卡数目已经达到上限,请先关闭不必要的选项卡!');
				}
			} else {
				TabPanel.setActiveTab(tab);
				tab.doLayout();
				TabPanel.doLayout();
				TabPanel = null;
				tabid = null;
				tab = null;
			}
		}
	}
});
function Lightblue() {
	// Default
	Ext.Ajax.request({
				url : UrlConvert('SysSet/ThemeSave'),
				method : 'POST',
				params : {
					data : 'Default'
				},
				success : function(response, options) {
					var obj = Ext.JSON.decode(response.responseText);
					if (obj.success) {
						Ext.Msg.alert('提示', obj.msg);
					} else {
						Ext.Msg.alert("消息", obj.msg);
					}
				}

			});
}
function Silvergray() {
	// Gray灰色
	Ext.Ajax.request({
				url : UrlConvert('SysSet/ThemeSave'),
				method : 'POST',
				params : {
					data : 'Gray'
				},
				success : function(response, options) {
					var obj = Ext.JSON.decode(response.responseText);
					if (obj.success) {
						Ext.Msg.alert('提示', obj.msg);
					} else {
						Ext.Msg.alert("消息", obj.msg);
					}
				}

			});
}
function Deepcolor() {
	// Access
	Ext.Ajax.request({
				url : UrlConvert('SysSet/ThemeSave'),
				method : 'POST',
				params : {
					data : 'Access'
				},
				success : function(response, options) {
					var obj = Ext.JSON.decode(response.responseText);
					if (obj.success) {
						Ext.Msg.alert('提示', obj.msg);
					} else {
						Ext.Msg.alert("消息", obj.msg);
					}
				}

			});

}

// 刷新
function Reflash(obj) {
	window.location.reload();
}
// 首页
function Home(obj) {
	var tabid = 'MyPortal';
	var TabPanel = Ext.getCmp('FrameworkTabPanel');
	var tab = TabPanel.getComponent(tabid);
	// 加载所需的controller;

	var c;
	for (var i = 0; i < SinoydFrameworkApplication.controllers.length; i++) {
		if ('MyPortal' === SinoydFrameworkApplication.controllers.items[i].id) {
			c = SinoydFrameworkApplication.controllers.items[i];
		}
	}
	if (!c) {
		c = SinoydFrameworkApplication.getController('MyPortal');
		c.init();
	}
	var tab = TabPanel.getComponent(tabid);
	// 该tab不存在,且未达到选项卡上限时,可以新增一个tab
	if (tab == null || tab == undefined) {
		if (TabPanel.items.length < Application.MAXTabCount) {
			tab = Ext.create('Ext.panel.Panel', {
						id : tabid,
						title : '我的首页',
						autoScroll : false,
						layout : 'fit',
						border : false,
						closable : false,
						bodyStyle : {
							overflow : 'hide'
						},
						items : eval("c.initView()")
					});
			TabPanel.add(tab);
		} else {
			Ext.Msg.alert('提示', '选项卡数目已经达到上限,请先关闭不必要的选项卡!');
		}
	}
	TabPanel.setActiveTab(tab);
	tab.doLayout();
	TabPanel.doLayout();
	TabPanel = null;
	tabid = null;
	tab = null;
}
// 设置
function SZ() {
	var tabid = 'tabSysSetinitView'; // 个人设置tab的id
	var TabPanel = Ext.getCmp('FrameworkTabPanel');
	var tab = TabPanel.getComponent(tabid);
	// 加载所需的controller;

	var c;
	for (var i = 0; i < SinoydFrameworkApplication.controllers.length; i++) {
		if ('SysSet' === SinoydFrameworkApplication.controllers.items[i].id) {
			c = SinoydFrameworkApplication.controllers.items[i];
		}
	}
	if (!c) {
		c = SinoydFrameworkApplication.getController('SysSet');
		c.init();
	}
	var tab = TabPanel.getComponent(tabid);
	// 该tab不存在,且未达到选项卡上限时,可以新增一个tab
	if (tab == null || tab == undefined) {
		if (TabPanel.items.length < Application.MAXTabCount) {
			tab = Ext.create('Ext.panel.Panel', {
						id : tabid,
						title : '个人设置',
						autoScroll : false,
						layout : 'fit',
						border : false,
						closable : true,
						bodyStyle : {
							overflow : 'hide'
						},
						items : eval("c.initView()")
					});
			TabPanel.add(tab);
		} else {
			Ext.Msg.alert('提示', '选项卡数目已经达到上限,请先关闭不必要的选项卡!');
		}
	}
	TabPanel.setActiveTab(tab);
	tab.doLayout();
	TabPanel.doLayout();
	TabPanel = null;
	tabid = null;
	tab = null;
}
function Help() {

	// var panelHelp = Ext.create('SinoydFramework.view.help.HelpPanel');
	var panelHelp = Ext.create('Ext.panel.Panel', {
		autoScroll : false,
		layout : 'fit',
		border : false,
		closable : false,
		width : 830,
		height : 485,
		bodyStyle : {
			overflow : 'hide'
		},
		html : ' <img src="../Content/Themes/Common/images/help.jpg" style="text-align: center; vertical-align: middle;" />'
	});
	var win = Ext.create('Ext.window.Window', {
				iconCls : 'application',
				title : '系统帮助',
				height : 500,
				modal : true,
				border : false,
				width : 830,
				layout : 'fit',
				items : panelHelp
			}).show();
}
// 退出
function Exit() {
	// 获取考勤登出地址
	// Ext.Ajax.request({
	// url: Application.SignOutAttendance,
	// method: 'GET',
	// callback: function (options, success, response) {
	// debugger
	// if (!success) {
	// Ext.Msg.alert('提示', '考勤登记失败！',
	// function () { window.location = UrlConvert("Access/Logout"); });
	// }
	// else {
	// window.location = UrlConvert("Access/Logout");
	// }
	// }
	// });
	Ext.Msg.alert('提示', '是否确认注销！', function() {
				window.location = UrlConvert("Access/Logout");
			});
}
function mouseout(obj) {
	obj.className = obj.className.substr(0, obj.className.length - 5);
}
function mouseover(obj) {
	obj.className = obj.className + "Focus";
}
function UpDown(obj) {
	if (obj.className == "divCenterDown") {
		obj.className = "divCenterUp";
		Ext.ComponentQuery.query('frameworkTopPanel')[0].hide();
	} else if (obj.className == "divCenterUp") {
		obj.className = "divCenterDown";
		Ext.ComponentQuery.query('frameworkTopPanel')[0].show();
	}
}