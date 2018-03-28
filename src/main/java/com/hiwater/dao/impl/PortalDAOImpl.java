package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.PortalDAO;
import com.hiwater.pojo.Portal;
import org.springframework.stereotype.Repository;

@Repository
public class PortalDAOImpl  extends HibernateTemplate implements PortalDAO {

	public List<Portal> getPortalList() {
		// TODO Auto-generated method stub
		return (List<Portal>) find("from Potal");
	}

	public void add(Portal p) {
		// TODO Auto-generated method stub
		save(p);

	}

	public Portal getPortal(String id) {
		// TODO Auto-generated method stub
		return (Portal) find("from Potal p where p.Id='"+id+"'");
	}

}
