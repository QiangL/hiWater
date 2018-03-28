package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Material;

public interface MaterialDAO {
	
	public List<Material> getMaterialList();
	public void add(Material m);

}
