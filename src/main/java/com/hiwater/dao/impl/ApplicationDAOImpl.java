package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.ApplicationDAO;
import com.hiwater.pojo.Application;
import com.hiwater.pojo.Role;
import org.springframework.stereotype.Repository;

@Repository
public class ApplicationDAOImpl extends HibernateTemplate implements ApplicationDAO {

	public List<Application> getApplicationList() {
		// TODO Auto-generated method stub
		return (List<Application>) find("from Application");
	}

	public void add(Application a) {
		// TODO Auto-generated method stub
		save(a);
	}

}
