package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.User;
import com.hiwater.service.UserService;

import net.sf.json.JSONArray;

public class UserAction {
	
	UserService userService;
	List<User> users;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public String getUserList() {
		System.out.println("getallusers+++++++++++++++++++++++++++++++=");
		users=userService.getUserList();
		JSONArray jsonArray = JSONArray.fromObject(users);
		 String returnString = jsonArray.toString();
		 System.out.println(returnString);
		return "LISTJSP";
	}
	
	
}
