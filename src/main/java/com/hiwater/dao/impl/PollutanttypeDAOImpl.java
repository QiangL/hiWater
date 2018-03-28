package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.PollutanttypeDAO;
import com.hiwater.pojo.Pollutanttype;
import org.springframework.stereotype.Repository;

@Repository
public class PollutanttypeDAOImpl  extends HibernateTemplate implements PollutanttypeDAO {

	public List<Pollutanttype> getPollutanttypeList() {
		// TODO Auto-generated method stub
		return (List<Pollutanttype>) find("from Pollutanttype");
	}

	public void add(Pollutanttype p) {
		// TODO Auto-generated method stub
		save(p);

	}

}
