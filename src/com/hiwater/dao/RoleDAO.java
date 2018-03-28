package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Role;


public interface RoleDAO {

	public List<Role> getRoleList();
	public void add(Role r);
}
