package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Portal;
import com.hiwater.service.PortalService;

public class PortalAction {
	
	PortalService portalService;
	List<Portal> portals;
	public PortalService getPortalService() {
		return portalService;
	}
	public void setPortalService(PortalService portalService) {
		this.portalService = portalService;
	}
	public List<Portal> getPortals() {
		return portals;
	}
	public void setPortals(List<Portal> portals) {
		this.portals = portals;
	}
	
	public String getPortalList() {
		System.out.println("getPortallist+++++++++++++++++++++++++++++++=");
		portals = portalService.getPortalList();
		System.out.println(portals.get(0).getId());
		return "LISTJSP";
	}
	

}
