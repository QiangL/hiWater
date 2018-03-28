package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.WaterareatypeDAO;
import com.hiwater.pojo.Waterareatype;

public class WaterareatypeDAOImpl  extends HibernateTemplate implements WaterareatypeDAO {

	@Override
	public List<Waterareatype> getWaterareatypeList() {
		// TODO Auto-generated method stub
		return (List<Waterareatype>) find("from Waterareatype");
	}

	@Override
	public void add(Waterareatype w) {
		// TODO Auto-generated method stub
		save(w);

	}

}
