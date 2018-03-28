package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.PortalItem;
import com.hiwater.service.PortalItemService;

public class PortalItemAction {
	
	PortalItemService portalItemService;
	List<PortalItem> portalItems;
	
	public PortalItemService getPortalItemService() {
		return portalItemService;
	}
	public void setPortalItemService(PortalItemService portalItemService) {
		this.portalItemService = portalItemService;
	}
	public List<PortalItem> getPortalItems() {
		return portalItems;
	}
	public void setPortalItems(List<PortalItem> portalItems) {
		this.portalItems = portalItems;
	}
	
	public String getPortalItemList() {
		System.out.println("getPortalItemslist+++++++++++++++++++++++++++++++=");
		portalItems = portalItemService.getPortalItemList();
		System.out.println(portalItems.get(0).getApplicationPath());
		return "LISTJSP";
	}

}
