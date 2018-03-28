package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.ValleyDAO;
import com.hiwater.pojo.Valley;
import com.hiwater.service.ValleyService;

public class ValleyServiceImpl implements ValleyService {
	
	ValleyDAO valleyDAO;

	public ValleyDAO getValleyDAO() {
		return valleyDAO;
	}

	public void setValleyDAO(ValleyDAO valleyDAO) {
		this.valleyDAO = valleyDAO;
	}

	@Override
	public void addValley(Valley v) {
		// TODO Auto-generated method stub
		valleyDAO.add(v);
	}

	@Override
	public List<Valley> getValleyList() {
		// TODO Auto-generated method stub
		return valleyDAO.getValleyList();
	}

}
