package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.NavigationItemDAO;
import com.hiwater.pojo.NavigationItem;
import com.hiwater.service.NavigationItemService;

public class NavigationItemServiceImpl implements NavigationItemService {
	
	NavigationItemDAO navigationItemDAO;

	public NavigationItemDAO getNavigationItemDAO() {
		return navigationItemDAO;
	}

	public void setNavigationItemDAO(NavigationItemDAO navigationItemDAO) {
		this.navigationItemDAO = navigationItemDAO;
	}

	@Override
	public void addNavigationItem(NavigationItem n) {
		// TODO Auto-generated method stub
		navigationItemDAO.add(n);

	}

	@Override
	public List<NavigationItem> getNavigationItemList() {
		// TODO Auto-generated method stub
		return navigationItemDAO.getNavigationItemList();
	}

}
