package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Navigation;
import com.hiwater.service.NavigationService;

public class NavigationAction {
	
	NavigationService navigationService;
	List<Navigation> navigations;
	
	public NavigationService getNavigationService() {
		return navigationService;
	}
	public void setNavigationService(NavigationService navigationService) {
		this.navigationService = navigationService;
	}
	public List<Navigation> getNavigations() {
		return navigations;
	}
	public void setNavigations(List<Navigation> navigations) {
		this.navigations = navigations;
	}
	public String getNavigationList() {
		System.out.println("getNavigationlist+++++++++++++++++++++++++++++++=");
		navigations = navigationService.getNavigationList();
		System.out.println(navigations.get(0).getId());
		return "LISTJSP";

	}
	

}
