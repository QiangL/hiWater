package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.Portal;

public interface PortalService {

	public void addPortal(Portal p);
	public List<Portal> getPortalList();
	public Portal getPortal(String id);

}
