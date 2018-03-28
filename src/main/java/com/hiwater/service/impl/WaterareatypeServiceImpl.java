package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.WaterareatypeDAO;
import com.hiwater.pojo.Waterareatype;

public class WaterareatypeServiceImpl implements com.hiwater.service.WaterareatypeService {
	
	WaterareatypeDAO waterareatypeDAO;


	public WaterareatypeDAO getWaterareatypeDAO() {
		return waterareatypeDAO;
	}

	public void setWaterareatypeDAO(WaterareatypeDAO waterareatypeDAO) {
		this.waterareatypeDAO = waterareatypeDAO;
	}

	@Override
	public void addWaterareatype(Waterareatype w) {
		// TODO Auto-generated method stub
		waterareatypeDAO.add(w);
	}

	@Override
	public List<Waterareatype> getWaterareatypeList() {
		// TODO Auto-generated method stub
		return waterareatypeDAO.getWaterareatypeList();
	}

}
