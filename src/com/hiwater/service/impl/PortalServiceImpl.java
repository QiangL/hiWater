package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.PortalDAO;
import com.hiwater.pojo.Portal;
import com.hiwater.service.PortalService;

public class PortalServiceImpl implements PortalService {
	
	PortalDAO portalDAO;

	public PortalDAO getPortalDAO() {
		return portalDAO;
	}

	public void setPortalDAO(PortalDAO portalDAO) {
		this.portalDAO = portalDAO;
	}

	@Override
	public void addPortal(Portal p) {
		// TODO Auto-generated method stub
		portalDAO.add(p);
	}

	@Override
	public List<Portal> getPortalList() {
		// TODO Auto-generated method stub
		return portalDAO.getPortalList();
	}

	@Override
	public Portal getPortal(String id) {
		// TODO Auto-generated method stub
		return portalDAO.getPortal(id);
	}

}
