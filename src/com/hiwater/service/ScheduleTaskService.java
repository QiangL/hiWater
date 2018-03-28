package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.ScheduleTask;

public interface ScheduleTaskService {
	
	public void addScheduleTask(ScheduleTask st);
	public List<ScheduleTask> getScheduleTaskList();


}
