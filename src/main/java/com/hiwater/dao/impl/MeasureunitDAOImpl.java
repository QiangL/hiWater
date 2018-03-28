package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.MeasureunitDAO;
import com.hiwater.pojo.Measureunit;
import org.springframework.stereotype.Repository;

@Repository
public class MeasureunitDAOImpl extends HibernateTemplate  implements MeasureunitDAO {

	public List<Measureunit> getMeasureunitList() {
		// TODO Auto-generated method stub
		return (List<Measureunit>) find("from Measureunit");
	}

	public void add(Measureunit m) {
		// TODO Auto-generated method stub

		save(m);
	}

}
