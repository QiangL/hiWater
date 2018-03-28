package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.RegionDAO;
import com.hiwater.pojo.Region;

public class RegionDAOImpl  extends HibernateTemplate implements RegionDAO {

	@Override
	public List<Region> getRegionList() {
		// TODO Auto-generated method stub
		return (List<Region>) find("from Region");
	}

	@Override
	public void add(Region r) {
		// TODO Auto-generated method stub
		save(r);

	}

}
