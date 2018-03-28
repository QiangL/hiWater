package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.User;

public interface UserDAO {
	
	public void add(User u);
	public List<User> getUserList();
	public List<User> getUserByLoginName(String ln);
	public User getUser(String id);

}
