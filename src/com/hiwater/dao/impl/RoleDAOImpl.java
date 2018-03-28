package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.RoleDAO;
import com.hiwater.pojo.Role;

public class RoleDAOImpl extends HibernateTemplate implements RoleDAO {

	@Override
	public List<Role> getRoleList() {
		// TODO Auto-generated method stub
		return (List<Role>) find("from Role");
	}

	@Override
	public void add(Role r) {
		// TODO Auto-generated method stub
		save(r);
	}

}
