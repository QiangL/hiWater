package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.ActionDAO;
import com.hiwater.pojo.Action;

public class ActionDAOImpl extends HibernateTemplate implements ActionDAO {

	@Override
	public List<Action> getActionList() {
		// TODO Auto-generated method stub
		return (List<Action>) find("from Action");
	}

	@Override
	public void add(Action a) {
		// TODO Auto-generated method stub
		save(a);

	}

}
