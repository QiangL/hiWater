package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.LogDAO;
import com.hiwater.pojo.Log;
import org.springframework.stereotype.Repository;

@Repository
public class LogDAOImpl extends HibernateTemplate implements LogDAO {

	public void add(Log l) {
		// TODO Auto-generated method stub
		save(l);
	}

	public List<Log> getLogList() {
		// TODO Auto-generated method stub
		return (List<Log>) find("from Log");
	}

}
