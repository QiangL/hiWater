package com.hiwater.action;

import java.util.HashMap;
import java.util.Map;

import com.hiwater.pojo.User;
import com.hiwater.service.UserService;

import net.sf.json.JSONObject;

public class LoginAction {
	
	private String Name;
	private String Pwd;
	private String url;
	
	private Map<String,Object> dataMap;

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	UserService userService;
	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String login() {
		
		dataMap = new HashMap<String, Object>();

		user = userService.loginUser(Name, Pwd);
		if (user != null) {
			dataMap.put("success",true);
			dataMap.put("data","/HiWater");
			dataMap.put("extraData",null);
			dataMap.put("failureCode",0);
			System.out.println("aaaaa");
			return "success";
		} else {
			dataMap.put("success",true);
			dataMap.put("msg","用户名或密码无效！");
			dataMap.put("data",null);
			dataMap.put("extraData", null);
			dataMap.put("failureCode",0);
			System.out.println("bbbbb");
			return "failure";
		}
	}

}
