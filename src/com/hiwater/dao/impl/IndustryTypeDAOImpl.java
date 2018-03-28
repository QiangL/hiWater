package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.IndustryTypeDAO;
import com.hiwater.pojo.IndustryType;

public class IndustryTypeDAOImpl extends HibernateTemplate  implements IndustryTypeDAO {

	@Override
	public List<IndustryType> getIndustryTypeList() {
		// TODO Auto-generated method stub
		return (List<IndustryType>) find("from IndustryType");
	}

	@Override
	public void add(IndustryType it) {
		// TODO Auto-generated method stub
		save(it);
	}

}
