package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.LogDAO;
import com.hiwater.pojo.Log;

public class LogDAOImpl extends HibernateTemplate implements LogDAO {

	@Override
	public void add(Log l) {
		// TODO Auto-generated method stub
		save(l);
	}

	@Override
	public List<Log> getLogList() {
		// TODO Auto-generated method stub
		return (List<Log>) find("from Log");
	}

}
