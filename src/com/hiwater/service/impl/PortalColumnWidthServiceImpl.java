package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.PortalColumnWidthDAO;
import com.hiwater.pojo.PortalColumnWidth;
import com.hiwater.service.PortalColumnWidthService;

public class PortalColumnWidthServiceImpl implements PortalColumnWidthService {
	
	PortalColumnWidthDAO portalColumnWidthDAO;

	public PortalColumnWidthDAO getPortalColumnWidthDAO() {
		return portalColumnWidthDAO;
	}

	public void setPortalColumnWidthDAO(PortalColumnWidthDAO portalColumnWidthDAO) {
		this.portalColumnWidthDAO = portalColumnWidthDAO;
	}

	@Override
	public void addportalColumnWidth(PortalColumnWidth p) {
		// TODO Auto-generated method stub
		portalColumnWidthDAO.add(p);
		
	}

	@Override
	public List<PortalColumnWidth> getPortalColumnWidthList() {
		// TODO Auto-generated method stub
		return portalColumnWidthDAO.getPortalColumnWidthList();
	}



}
