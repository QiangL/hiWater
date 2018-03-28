package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.PollutanttypeDAO;
import com.hiwater.pojo.Pollutanttype;
import com.hiwater.service.PollutanttypeService;

public class PollutanttypeServiceImpl implements PollutanttypeService {
	
	PollutanttypeDAO pollutanttypeDAO;

	public PollutanttypeDAO getPollutanttypeDAO() {
		return pollutanttypeDAO;
	}

	public void setPollutanttypeDAO(PollutanttypeDAO pollutanttypeDAO) {
		this.pollutanttypeDAO = pollutanttypeDAO;
	}

	@Override
	public void addPollutanttype(Pollutanttype p) {
		// TODO Auto-generated method stub

		pollutanttypeDAO.add(p);
	}

	@Override
	public List<Pollutanttype> getPollutanttypeList() {
		// TODO Auto-generated method stub
		return pollutanttypeDAO.getPollutanttypeList();
	}

}
