package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Region;
import com.hiwater.service.RegionService;

public class RegionAction {
	
	RegionService regionService;
	List<Region> regions;
	public RegionService getRegionService() {
		return regionService;
	}
	public void setRegionService(RegionService regionService) {
		this.regionService = regionService;
	}
	public List<Region> getRegions() {
		return regions;
	}
	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}
	
	public String getRegionList() {
		System.out.println("getRegionlist+++++++++++++++++++++++++++++++=");
		regions = regionService.getRegionList();
		System.out.println(regions.get(0).getHidChildRegionId());
		return "LISTJSP";
	}

}
