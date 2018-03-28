package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.UserDAO;
import com.hiwater.pojo.User;

public class UserDAOImpl extends HibernateTemplate implements UserDAO {

	@Override
	public void add(User u) {
		// TODO Auto-generated method stub
		save(u);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return (List<User>) find("from User");
	}

	@Override
	public List<User> getUserByLoginName(String ln) {
		// TODO Auto-generated method stub
		return (List<User>)find("from User u where u.loginName='"+ln+"'");
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return (User)find("from User u where u.Id='"+id+"'");
	}

}
