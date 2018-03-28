package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.ApplicationDAO;
import com.hiwater.pojo.Application;
import com.hiwater.pojo.Role;

public class ApplicationDAOImpl extends HibernateTemplate implements ApplicationDAO {

	@Override
	public List<Application> getApplicationList() {
		// TODO Auto-generated method stub
		return (List<Application>) find("from Application");
	}

	@Override
	public void add(Application a) {
		// TODO Auto-generated method stub
		save(a);
	}

}
