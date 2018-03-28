package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Role;
import com.hiwater.service.RoleService;

public class RoleAction {
	
	RoleService roleService;
	List<Role> roles;
	
	public RoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public String getRoleList(){
		System.out.println("getrolelist+++++++++++++++++++++++++++++++=");
		roles=roleService.getRoleList();
		System.out.println(roles.get(0).getDescription());
		return "LISTJSP";
	}

}
