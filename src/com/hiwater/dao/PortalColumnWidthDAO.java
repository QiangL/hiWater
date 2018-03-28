package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.PortalColumnWidth;

public interface PortalColumnWidthDAO {

	
	public List<PortalColumnWidth> getPortalColumnWidthList();
	public void add(PortalColumnWidth p);
}
