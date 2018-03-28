package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.BelongType;

public interface BelongTypeDAO {
	
	public List<BelongType> getBelongTypeList();
	public void add(BelongType bt);

}
