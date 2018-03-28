package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.BelongTypeDAO;
import com.hiwater.pojo.BelongType;

public class BelongTypeDAOImpl extends HibernateTemplate implements BelongTypeDAO {

	@Override
	public List<BelongType> getBelongTypeList() {
		// TODO Auto-generated method stub
		return (List<BelongType>) find("from BelongType");
	}

	@Override
	public void add(BelongType bt) {
		// TODO Auto-generated method stub
		save(bt);

	}

}
