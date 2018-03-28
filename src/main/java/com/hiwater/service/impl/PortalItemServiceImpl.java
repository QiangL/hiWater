package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.PortalItemDAO;
import com.hiwater.pojo.PortalItem;
import com.hiwater.service.PortalItemService;

public class PortalItemServiceImpl implements PortalItemService {
	
	PortalItemDAO portalItemDAO;

	public PortalItemDAO getPortalItemDAO() {
		return portalItemDAO;
	}

	public void setPortalItemDAO(PortalItemDAO portalItemDAO) {
		this.portalItemDAO = portalItemDAO;
	}

	@Override
	public void addPortalItem(PortalItem p) {
		// TODO Auto-generated method stub
		portalItemDAO.add(p);
	}

	@Override
	public List<PortalItem> getPortalItemList() {
		// TODO Auto-generated method stub
		return portalItemDAO.getPortalItemList();
	}

}
