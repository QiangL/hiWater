package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.PsgroupviewDAO;
import com.hiwater.pojo.Psgroupview;

public class PsgroupviewDAOImpl  extends HibernateTemplate implements PsgroupviewDAO {

	@Override
	public List<Psgroupview> getPsgroupviewList() {
		// TODO Auto-generated method stub
		return (List<Psgroupview>) find("from Psgroupview");
	}

	@Override
	public void add(Psgroupview p) {
		// TODO Auto-generated method stub
		save(p);

	}

}
