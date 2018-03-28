package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.NavigationItem;

public interface NavigationItemService {
	
	public void addNavigationItem(NavigationItem n);
	public List<NavigationItem> getNavigationItemList();

}
