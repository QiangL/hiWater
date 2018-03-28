package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Navigation;

public interface NavigationDAO {
	
	public List<Navigation> getNavigationList();
	public void add(Navigation n);

}
