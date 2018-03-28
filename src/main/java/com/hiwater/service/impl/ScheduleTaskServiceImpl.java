package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.ScheduleTaskDAO;
import com.hiwater.pojo.ScheduleTask;
import com.hiwater.service.ScheduleTaskService;

public class ScheduleTaskServiceImpl implements ScheduleTaskService {
	
	ScheduleTaskDAO scheduleTaskDAO;

	public ScheduleTaskDAO getScheduleTaskDAO() {
		return scheduleTaskDAO;
	}

	public void setScheduleTaskDAO(ScheduleTaskDAO scheduleTaskDAO) {
		this.scheduleTaskDAO = scheduleTaskDAO;
	}

	@Override
	public void addScheduleTask(ScheduleTask st) {
		// TODO Auto-generated method stub
		scheduleTaskDAO.add(st);
	}

	@Override
	public List<ScheduleTask> getScheduleTaskList() {
		// TODO Auto-generated method stub
		return scheduleTaskDAO.getScheduleTaskList();
	}

}
