package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.ScheduleTask;

public interface ScheduleTaskDAO {
	
	public List<ScheduleTask> getScheduleTaskList();
	public void add(ScheduleTask st);

}
