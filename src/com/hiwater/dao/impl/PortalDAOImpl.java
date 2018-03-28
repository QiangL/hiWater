package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.PortalDAO;
import com.hiwater.pojo.Portal;

public class PortalDAOImpl  extends HibernateTemplate implements PortalDAO {

	@Override
	public List<Portal> getPortalList() {
		// TODO Auto-generated method stub
		return (List<Portal>) find("from Potal");
	}

	@Override
	public void add(Portal p) {
		// TODO Auto-generated method stub
		save(p);

	}

	@Override
	public Portal getPortal(String id) {
		// TODO Auto-generated method stub
		return (Portal) find("from Potal p where p.Id='"+id+"'");
	}

}
