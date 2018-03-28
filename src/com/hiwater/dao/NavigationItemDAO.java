package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.NavigationItem;

public interface NavigationItemDAO {
	
	public List<NavigationItem> getNavigationItemList();
	public void add(NavigationItem n);


}
