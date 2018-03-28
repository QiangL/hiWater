package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Action;
import com.hiwater.service.ActionService;

public class ActionAction {
	
	ActionService actionService;
	List<Action> actions;
	public ActionService getActionService() {
		return actionService;
	}
	public void setActionService(ActionService actionService) {
		this.actionService = actionService;
	}
	public List<Action> getActions() {
		return actions;
	}
	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
	
	public String getActionList(){
		System.out.println("getActionlist+++++++++++++++++++++++++++++++=");
		actions=actionService.getActionList();
		System.out.println(actions.get(0).getRemark());
		return "LISTJSP";
	}

}
