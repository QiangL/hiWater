package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.MaterialDAO;
import com.hiwater.pojo.Material;

public class MaterialServiceImpl implements com.hiwater.service.MaterialService {
	
	MaterialDAO materialDAO;	

	public MaterialDAO getMaterialDAO() {
		return materialDAO;
	}

	public void setMaterialDAO(MaterialDAO materialDAO) {
		this.materialDAO = materialDAO;
	}

	@Override
	public void addMaterial(Material m) {
		// TODO Auto-generated method stub
		materialDAO.add(m);
		
	}

	@Override
	public List<Material> getMaterialList() {
		// TODO Auto-generated method stub
		return materialDAO.getMaterialList();
	}

}
