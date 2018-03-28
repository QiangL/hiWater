package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.Navigation;

public interface NavigationService {
	
	public void addNavigation(Navigation n);
	public List<Navigation> getNavigationList();

}
