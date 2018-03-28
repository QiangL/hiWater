package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.ValleyDAO;
import com.hiwater.pojo.Valley;

public class ValleyDAOImpl  extends HibernateTemplate implements ValleyDAO {

	@Override
	public List<Valley> getValleyList() {
		// TODO Auto-generated method stub
		return (List<Valley>) find("from Valley");
	}

	@Override
	public void add(Valley v) {
		// TODO Auto-generated method stub
		save(v);

	}

}
