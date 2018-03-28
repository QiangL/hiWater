package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Measureunit;

public interface MeasureunitDAO {
	
	public List<Measureunit> getMeasureunitList();
	public void add(Measureunit m);

}
