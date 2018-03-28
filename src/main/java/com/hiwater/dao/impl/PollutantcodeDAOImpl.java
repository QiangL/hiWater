package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.PollutantcodeDAO;
import com.hiwater.pojo.Pollutantcode;
import org.springframework.stereotype.Repository;

@Repository
public class PollutantcodeDAOImpl  extends HibernateTemplate implements PollutantcodeDAO {

	public List<Pollutantcode> getPollutantcodeList() {
		// TODO Auto-generated method stub
		return (List<Pollutantcode>) find("from Pollutantcode");
	}

	public void add(Pollutantcode p) {
		// TODO Auto-generated method stub
		save(p);

	}

}
