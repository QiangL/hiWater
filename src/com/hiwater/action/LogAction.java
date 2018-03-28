package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Log;
import com.hiwater.service.LogService;

public class LogAction {
	
	LogService logService;
	List<Log> logs;
	
	public LogService getLogService() {
		return logService;
	}
	public void setLogService(LogService logService) {
		this.logService = logService;
	}
	public List<Log> getLogs() {
		return logs;
	}
	public void setLogs(List<Log> logs) {
		this.logs = logs;
	}
	
	public String getLogList() {
		System.out.println("getLoglist+++++++++++++++++++++++++++++++=");
		logs = logService.getLogList();
		System.out.println(logs.get(0).getId());
		return "LISTJSP";
	}

}
