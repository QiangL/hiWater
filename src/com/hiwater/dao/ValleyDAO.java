package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Valley;

public interface ValleyDAO {
	
	public List<Valley> getValleyList();
	public void add(Valley v);

}
