package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.BelongTypeDAO;
import com.hiwater.pojo.BelongType;
import com.hiwater.service.BelongTypeService;

public class BelongTypeServiceImpl implements BelongTypeService {
	
	BelongTypeDAO belongTypeDAO;
	
	

	public BelongTypeDAO getBelongTypeDAO() {
		return belongTypeDAO;
	}

	public void setBelongTypeDAO(BelongTypeDAO belongTypeDAO) {
		this.belongTypeDAO = belongTypeDAO;
	}
	

	@Override
	public void addBelongType(BelongType bt) {
		// TODO Auto-generated method stub

		belongTypeDAO.add(bt);
	}

	@Override
	public List<BelongType> getBelongTypeList() {
		// TODO Auto-generated method stub
		List<BelongType> belongTypes=belongTypeDAO.getBelongTypeList();
		return belongTypes;
	}

}
