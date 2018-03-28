package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.UserDAO;
import com.hiwater.pojo.User;
import com.hiwater.service.UserService;

public class UserServiceImpl implements UserService{
	
	UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		List<User> users=userDAO.getUserList();
		return users;
	}

	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		userDAO.add(u);
	}

	@Override
	public User loginUser(String loginname, String password) {
		// TODO Auto-generated method stub
		List<User> users=userDAO.getUserByLoginName(loginname);
		if(users.size()>0) {
			User u=users.get(0);
			if(u.getPwd()==password) {
				return u;
			}
		}
		return null;
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return userDAO.getUser(id);
	}

}

