package com.hiwater.action;

import com.hiwater.service.PortalService;
import com.hiwater.service.UserService;

public class GetPortalByUserIdActionBean {
	
	private String Id;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	private UserService userService;
	private PortalService portalService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public PortalService getPortalService() {
		return portalService;
	}
	public void setPortalService(PortalService portalService) {
		this.portalService = portalService;
	}
	


}
