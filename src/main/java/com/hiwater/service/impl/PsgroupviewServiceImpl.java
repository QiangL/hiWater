package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.PsgroupviewDAO;
import com.hiwater.pojo.Psgroupview;
import com.hiwater.service.PsgroupviewService;

public class PsgroupviewServiceImpl implements PsgroupviewService {
	
	PsgroupviewDAO psgroupviewDAO;

	public PsgroupviewDAO getPsgroupviewDAO() {
		return psgroupviewDAO;
	}

	public void setPsgroupviewDAO(PsgroupviewDAO psgroupviewDAO) {
		this.psgroupviewDAO = psgroupviewDAO;
	}

	public void addPsgroupview(Psgroupview p) {
		// TODO Auto-generated method stub
		psgroupviewDAO.add(p);
	}

	public List<Psgroupview> getPsgroupviewList() {
		// TODO Auto-generated method stub
		return psgroupviewDAO.getPsgroupviewList();
	}

}
