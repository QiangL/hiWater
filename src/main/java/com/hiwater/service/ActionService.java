package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.Action;

public interface ActionService {
	public void addAction(Action a);
	public List<Action> getActionList();

}
