package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Waterareatype;

public interface WaterareatypeDAO {
	
	public List<Waterareatype> getWaterareatypeList();
	public void add(Waterareatype w);

}
