package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.MeasureunitDAO;
import com.hiwater.pojo.Measureunit;

public class MeasureunitDAOImpl extends HibernateTemplate  implements MeasureunitDAO {

	@Override
	public List<Measureunit> getMeasureunitList() {
		// TODO Auto-generated method stub
		return (List<Measureunit>) find("from Measureunit");
	}

	@Override
	public void add(Measureunit m) {
		// TODO Auto-generated method stub

		save(m);
	}

}
