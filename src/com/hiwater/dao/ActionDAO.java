package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Action;

public interface ActionDAO {
	
	public List<Action> getActionList();
	public void add(Action a);

}
