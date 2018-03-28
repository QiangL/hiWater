package com.hiwater.service.impl;

import java.util.List;
import com.hiwater.dao.RoleDAO;
import com.hiwater.pojo.Role;
import com.hiwater.service.RoleService;

public class RoleServiceImpl implements RoleService {

	RoleDAO roleDAO;
	
	public RoleDAO getRoleDAO() {
		return roleDAO;
	}

	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	@Override
	public List<Role> getRoleList() {
		// TODO Auto-generated method stub
		List<Role> roles= roleDAO.getRoleList();
		return roles;
	}

	@Override
	public void addRole(Role r) {
		// TODO Auto-generated method stub
		roleDAO.add(r);
	}

}
