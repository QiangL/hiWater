package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.RegionDAO;
import com.hiwater.pojo.Region;
import com.hiwater.service.RegionService;

public class RegionServiceImpl implements RegionService {
	
	RegionDAO regionDAO;
	
	public RegionDAO getRegionDAO() {
		return regionDAO;
	}

	public void setRegionDAO(RegionDAO regionDAO) {
		this.regionDAO = regionDAO;
	}

	@Override
	public void addRegion(Region r) {
		// TODO Auto-generated method stub
		regionDAO.add(r);
	}

	@Override
	public List<Region> getRegionList() {
		// TODO Auto-generated method stub
		return regionDAO.getRegionList();
	}

}
