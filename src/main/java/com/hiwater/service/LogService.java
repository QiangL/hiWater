package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.Log;

public interface LogService {
	
	public void addLog(Log l);
	public List<Log> getLogList();

}
