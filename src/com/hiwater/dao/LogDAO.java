package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Log;

public interface LogDAO {
	
	public void add(Log l);
	public List<Log> getLogList();

}
