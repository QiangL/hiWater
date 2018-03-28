package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.PortalItem;

public interface PortalItemDAO {
	

	public List<PortalItem> getPortalItemList();
	public void add(PortalItem p);

}
