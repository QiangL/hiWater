package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.LogDAO;
import com.hiwater.pojo.Log;
import com.hiwater.service.LogService;

public class LogServiceImpl implements LogService {
	
	LogDAO logDAO;

	public LogDAO getLogDAO() {
		return logDAO;
	}

	public void setLogDAO(LogDAO logDAO) {
		this.logDAO = logDAO;
	}

	@Override
	public void addLog(Log l) {
		// TODO Auto-generated method stub
		logDAO.add(l);
	}

	@Override
	public List<Log> getLogList() {
		// TODO Auto-generated method stub
		return logDAO.getLogList();
	}

}
