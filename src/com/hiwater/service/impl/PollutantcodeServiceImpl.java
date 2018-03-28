package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.PollutantcodeDAO;
import com.hiwater.pojo.Pollutantcode;
import com.hiwater.service.PollutantcodeService;

public class PollutantcodeServiceImpl implements PollutantcodeService {
	
	public PollutantcodeDAO getPollutantcodeDAO() {
		return pollutantcodeDAO;
	}

	public void setPollutantcodeDAO(PollutantcodeDAO pollutantcodeDAO) {
		this.pollutantcodeDAO = pollutantcodeDAO;
	}

	PollutantcodeDAO pollutantcodeDAO;

	@Override
	public void addPollutantcode(Pollutantcode p) {
		// TODO Auto-generated method stub
		
		pollutantcodeDAO.add(p);

	}

	@Override
	public List<Pollutantcode> getPollutantcodeList() {
		// TODO Auto-generated method stub
		return pollutantcodeDAO.getPollutantcodeList();
	}

}
