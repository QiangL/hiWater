package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.User;

public interface UserService {
	
	public List<User> getUserList();
	public void addUser(User u);
	public User loginUser(String loginname,String password);
	public User getUser(String id);

}
