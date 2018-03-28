package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.pojo.PortalItem;

public class PortalItemDAOImpl  extends HibernateTemplate implements com.hiwater.dao.PortalItemDAO {

	@Override
	public List<PortalItem> getPortalItemList() {
		// TODO Auto-generated method stub
		return (List<PortalItem>) find("from PortalItem");
	}

	@Override
	public void add(PortalItem p) {
		// TODO Auto-generated method stub
		save(p);

	}

}
