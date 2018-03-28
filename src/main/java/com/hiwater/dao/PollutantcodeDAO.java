package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Pollutantcode;

public interface PollutantcodeDAO {
	
	public List<Pollutantcode> getPollutantcodeList();
	public void add(Pollutantcode p);

}
