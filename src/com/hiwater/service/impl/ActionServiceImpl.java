package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.ActionDAO;
import com.hiwater.pojo.Action;
import com.hiwater.service.ActionService;

public class ActionServiceImpl implements ActionService {
	ActionDAO actionDAO;
	

	public ActionDAO getActionDAO() {
		return actionDAO;
	}

	public void setActionDAO(ActionDAO actionDAO) {
		this.actionDAO = actionDAO;
	}

	@Override
	public void addAction(Action a) {
		// TODO Auto-generated method stub
		actionDAO.add(a);

	}

	@Override
	public List<Action> getActionList() {
		// TODO Auto-generated method stub
		List<Action> actions=actionDAO.getActionList();
 		return actions;
	}

}
