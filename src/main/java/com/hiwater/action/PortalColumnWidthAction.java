package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.PortalColumnWidth;
import com.hiwater.service.PortalColumnWidthService;

public class PortalColumnWidthAction {
	
	PortalColumnWidthService portalColumnWidthService;
	List<PortalColumnWidth> portalColumnWidths;
	public PortalColumnWidthService getPortalColumnWidthService() {
		return portalColumnWidthService;
	}
	public void setPortalColumnWidthService(PortalColumnWidthService portalColumnWidthService) {
		this.portalColumnWidthService = portalColumnWidthService;
	}
	public List<PortalColumnWidth> getPortalColumnWidths() {
		return portalColumnWidths;
	}
	public void setPortalColumnWidths(List<PortalColumnWidth> portalColumnWidths) {
		this.portalColumnWidths = portalColumnWidths;
	}
	
	public String getPortalColumnWidthList() {
		System.out.println("getPortalClumnWidthlist+++++++++++++++++++++++++++++++=");
		portalColumnWidths = portalColumnWidthService.getPortalColumnWidthList();
		System.out.println(portalColumnWidths.get(0).getPortalId());
		return "LISTJSP";
		
	}

}
