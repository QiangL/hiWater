package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.BelongType;
import com.hiwater.pojo.Code;
import com.hiwater.service.BelongTypeService;
import com.hiwater.service.CodeService;

public class BelongTypeAction {
	
	BelongTypeService belongTypeService;
	List<BelongType> belongTypes;
	public BelongTypeService getBelongTypeService() {
		return belongTypeService;
	}
	public void setBelongTypeService(BelongTypeService belongTypeService) {
		this.belongTypeService = belongTypeService;
	}
	public List<BelongType> getBelongTypes() {
		return belongTypes;
	}
	public void setBelongTypes(List<BelongType> belongTypes) {
		this.belongTypes = belongTypes;
	}
	
	public String getBelongTypeList() {
		System.out.println("getBelongTypelist+++++++++++++++++++++++++++++++=");
		belongTypes = belongTypeService.getBelongTypeList();
		System.out.println(belongTypes.get(0).getTxtBelongTypeNamee());
		return "LISTJSP";

	}

}
