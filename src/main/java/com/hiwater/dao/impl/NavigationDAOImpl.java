package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.NavigationDAO;
import com.hiwater.pojo.Navigation;
import org.springframework.stereotype.Repository;

@Repository
public class NavigationDAOImpl  extends HibernateTemplate implements NavigationDAO {

	public List<Navigation> getNavigationList() {
		// TODO Auto-generated method stub
		return (List<Navigation>) find("from Navigation");
	}

	public void add(Navigation n) {
		// TODO Auto-generated method stub
		save(n);

	}

}
