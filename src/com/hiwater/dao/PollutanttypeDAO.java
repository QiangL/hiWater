package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Pollutanttype;

public interface PollutanttypeDAO {
	
	public List<Pollutanttype> getPollutanttypeList();
	public void add(Pollutanttype p);

}
