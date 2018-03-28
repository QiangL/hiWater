package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Portal;

public interface PortalDAO {
	
	public List<Portal> getPortalList();
	public void add(Portal p);
	public Portal getPortal(String id);

}
