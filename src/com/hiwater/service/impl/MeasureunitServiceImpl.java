package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.MeasureunitDAO;
import com.hiwater.pojo.Measureunit;
import com.hiwater.service.MeasureunitService;

public class MeasureunitServiceImpl implements MeasureunitService {
	
	MeasureunitDAO measureunitDAO;

	public MeasureunitDAO getMeasureunitDAO() {
		return measureunitDAO;
	}

	public void setMeasureunitDAO(MeasureunitDAO measureunitDAO) {
		this.measureunitDAO = measureunitDAO;
	}

	@Override
	public void addMeasureunit(Measureunit m) {
		// TODO Auto-generated method stub
		measureunitDAO.add(m);

	}

	@Override
	public List<Measureunit> getMeasureunitList() {
		// TODO Auto-generated method stub
		return measureunitDAO.getMeasureunitList();
	}

}
