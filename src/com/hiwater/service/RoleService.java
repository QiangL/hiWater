package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.Role;

public interface RoleService {

	public List<Role> getRoleList();
	public void addRole(Role r);
}
