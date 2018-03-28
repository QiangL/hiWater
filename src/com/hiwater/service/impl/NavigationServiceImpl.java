package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.NavigationDAO;
import com.hiwater.pojo.Navigation;
import com.hiwater.service.NavigationService;

public class NavigationServiceImpl implements NavigationService {
	
	NavigationDAO navigationDAO;

	public NavigationDAO getNavigationDAO() {
		return navigationDAO;
	}

	public void setNavigationDAO(NavigationDAO navigationDAO) {
		this.navigationDAO = navigationDAO;
	}

	@Override
	public void addNavigation(Navigation n) {
		// TODO Auto-generated method stub
		navigationDAO.add(n);

	}

	@Override
	public List<Navigation> getNavigationList() {
		// TODO Auto-generated method stub
		return navigationDAO.getNavigationList();
	}

}
