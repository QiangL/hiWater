package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ScheduleTask")
public class ScheduleTask {
	
	private String Id;
	private String FullName;
	private String TaskName;
	private String TaskParas;
	private String Cron;
	private String StartTime;
	private String EndTime;
	private String RetryCount;
	private String Desc;
	private String State;
	private String NextTime;
	private String PrevTime;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Id")
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Column(name = "FullName")
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	@Column(name = "TaskName")
	public String getTaskName() {
		return TaskName;
	}
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
	@Column(name = "TaskParas")
	public String getTaskParas() {
		return TaskParas;
	}
	public void setTaskParas(String taskParas) {
		TaskParas = taskParas;
	}
	@Column(name = "Cron")
	public String getCron() {
		return Cron;
	}
	public void setCron(String cron) {
		Cron = cron;
	}
	@Column(name = "StartTime")
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	@Column(name = "EndTime")
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	@Column(name = "RetryCount")
	public String getRetryCount() {
		return RetryCount;
	}
	public void setRetryCount(String retryCount) {
		RetryCount = retryCount;
	}
	@Column(name = "Desc")
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	@Column(name = "State")
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Column(name = "NextTime")
	public String getNextTime() {
		return NextTime;
	}
	public void setNextTime(String nextTime) {
		NextTime = nextTime;
	}
	@Column(name = "PrevTime")
	public String getPrevTime() {
		return PrevTime;
	}
	public void setPrevTime(String prevTime) {
		PrevTime = prevTime;
	}
	
	
	
}
