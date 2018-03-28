package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.ScheduleTask;
import com.hiwater.service.ScheduleTaskService;

public class ScheduleTaskAction {
	
	ScheduleTaskService scheduleTaskService;
	List<ScheduleTask> scheduleTasks;
	
	public ScheduleTaskService getScheduleTaskService() {
		return scheduleTaskService;
	}
	public void setScheduleTaskService(ScheduleTaskService scheduleTaskService) {
		this.scheduleTaskService = scheduleTaskService;
	}
	public List<ScheduleTask> getScheduleTasks() {
		return scheduleTasks;
	}
	public void setScheduleTasks(List<ScheduleTask> scheduleTasks) {
		this.scheduleTasks = scheduleTasks;
	}
	
	public String getScheduleTaskList() {
		System.out.println("getScheduleTaskslist+++++++++++++++++++++++++++++++=");
		scheduleTasks=scheduleTaskService.getScheduleTaskList();
		System.out.println(scheduleTasks.get(0).getId());
		return "LISTJSP";
	}
	
	

}
