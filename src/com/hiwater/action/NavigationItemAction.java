package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Navigation;
import com.hiwater.pojo.NavigationItem;
import com.hiwater.service.NavigationItemService;
import com.hiwater.service.NavigationService;

public class NavigationItemAction {
	
	NavigationItemService navigationItemService;
	List<NavigationItem> navigationItems;
	
	public NavigationItemService getNavigationItemService() {
		return navigationItemService;
	}

	public void setNavigationItemService(NavigationItemService navigationItemService) {
		this.navigationItemService = navigationItemService;
	}

	public List<NavigationItem> getNavigationItems() {
		return navigationItems;
	}

	public void setNavigationItems(List<NavigationItem> navigationItems) {
		this.navigationItems = navigationItems;
	}

	public String getNavigationItemList() {
		System.out.println("getNavigationItemlist+++++++++++++++++++++++++++++++=");
		navigationItems = navigationItemService.getNavigationItemList();
		System.out.println(navigationItems.get(0).getId());
		return "LISTJSP";

	}

}
