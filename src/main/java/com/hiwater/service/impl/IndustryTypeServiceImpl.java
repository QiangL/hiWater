package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.IndustryTypeDAO;
import com.hiwater.pojo.IndustryType;
import com.hiwater.service.IndustryTypeService;

public class IndustryTypeServiceImpl implements IndustryTypeService{
	
	IndustryTypeDAO industryTypeDAO;

	public IndustryTypeDAO getIndustryTypeDAO() {
		return industryTypeDAO;
	}

	public void setIndustryTypeDAO(IndustryTypeDAO industryTypeDAO) {
		this.industryTypeDAO = industryTypeDAO;
	}


	@Override
	public void addIndustryType(IndustryType it) {
		// TODO Auto-generated method stub
		industryTypeDAO.add(it);
	}

	@Override
	public List<IndustryType> getIndustryTypeList() {
		// TODO Auto-generated method stub
		List<IndustryType> industryTypes=industryTypeDAO.getIndustryTypeList();
		return industryTypes;
	}
	
	

}
