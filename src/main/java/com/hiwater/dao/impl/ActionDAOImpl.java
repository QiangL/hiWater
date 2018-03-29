package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.ActionDAO;
import com.hiwater.pojo.Action;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ActionDAOImpl extends HibernateTemplate implements ActionDAO {

	public List<Action> getActionList() {
		return (List<Action>) find("from Action");
	}

	public void add(Action a) {
		save(a);
	}

}
