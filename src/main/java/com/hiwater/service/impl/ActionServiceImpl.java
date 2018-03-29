package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.ActionDAO;
import com.hiwater.pojo.Action;
import com.hiwater.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ActionServiceImpl implements ActionService {
	@Autowired
	ActionDAO actionDAO;
	

	public ActionDAO getActionDAO() {
		return actionDAO;
	}

	public void setActionDAO(ActionDAO actionDAO) {
		this.actionDAO = actionDAO;
	}
	public void addAction(Action a) {
		// TODO Auto-generated method stub
		actionDAO.add(a);

	}
	public List<Action> getActionList() {
		// TODO Auto-generated method stub
		List<Action> actions=actionDAO.getActionList();
 		return actions;
	}

}
