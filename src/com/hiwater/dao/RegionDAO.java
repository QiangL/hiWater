package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Region;

public interface RegionDAO {
	
	public List<Region> getRegionList();
	public void add(Region r);



}
