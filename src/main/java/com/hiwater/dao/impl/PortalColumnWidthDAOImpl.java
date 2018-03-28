package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.PortalColumnWidthDAO;
import com.hiwater.pojo.PortalColumnWidth;
import org.springframework.stereotype.Repository;

@Repository
public class PortalColumnWidthDAOImpl  extends HibernateTemplate implements PortalColumnWidthDAO {

	public List<PortalColumnWidth> getPortalColumnWidthList() {
		// TODO Auto-generated method stub
		return (List<PortalColumnWidth>) find("from PortalColumnWidth");
	}

	public void add(PortalColumnWidth p) {
		// TODO Auto-generated method stub
		save(p);

	}

}
