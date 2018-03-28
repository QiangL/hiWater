package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.IndustryType;
import com.hiwater.service.IndustryTypeService;

public class IndustryTypeAction {
	
	IndustryTypeService industryTypeService;
	List<IndustryType> industryTypes;
	
	
	public IndustryTypeService getIndustryTypeService() {
		return industryTypeService;
	}


	public void setIndustryTypeService(IndustryTypeService industryTypeService) {
		this.industryTypeService = industryTypeService;
	}


	public List<IndustryType> getIndustryTypes() {
		return industryTypes;
	}


	public void setIndustryTypes(List<IndustryType> industryTypes) {
		this.industryTypes = industryTypes;
	}


	public String getIndustryTypeList() {
		System.out.println("getIndustryTypelist+++++++++++++++++++++++++++++++=");
		industryTypes = industryTypeService.getIndustryTypeList();
		System.out.println(industryTypes.get(0).getOnUser());
		return "LISTJSP";

	}

}
