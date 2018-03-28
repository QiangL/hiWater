package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.ScheduleTaskDAO;
import com.hiwater.pojo.ScheduleTask;

public class ScheduleTaskDAOImpl  extends HibernateTemplate implements ScheduleTaskDAO {

	@Override
	public List<ScheduleTask> getScheduleTaskList() {
		// TODO Auto-generated method stub
		return (List<ScheduleTask>) find("from ScheduleTask");
	}

	@Override
	public void add(ScheduleTask st) {
		// TODO Auto-generated method stub
		save(st);

	}

}
