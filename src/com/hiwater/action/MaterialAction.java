package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Material;
import com.hiwater.service.MaterialService;

public class MaterialAction {
	MaterialService materialService;
	List<Material> materials;
	
	public MaterialService getMaterialService() {
		return materialService;
	}
	public void setMaterialService(MaterialService materialService) {
		this.materialService = materialService;
	}
	public List<Material> getMaterials() {
		return materials;
	}
	public void setMaterials(List<Material> materials) {
		this.materials = materials;
	}
	
	public String getMaterialList() {
		System.out.println("getMateriallist+++++++++++++++++++++++++++++++=");
		materials = materialService.getMaterialList();
		System.out.println(materials.get(0).getTxtProperties());
		return "LISTJSP";
	}
	

}
