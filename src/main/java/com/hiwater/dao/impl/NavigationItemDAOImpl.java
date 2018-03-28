package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.NavigationItemDAO;
import com.hiwater.pojo.NavigationItem;
import org.springframework.stereotype.Repository;

@Repository
public class NavigationItemDAOImpl  extends HibernateTemplate implements NavigationItemDAO {

	public List<NavigationItem> getNavigationItemList() {
		// TODO Auto-generated method stub
		return (List<NavigationItem>) find("from NavigationItem");
	}

	public void add(NavigationItem n) {
		// TODO Auto-generated method stub

		save(n);
	}

}
