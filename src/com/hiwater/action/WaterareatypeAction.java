package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Waterareatype;
import com.hiwater.service.WaterareatypeService;

public class WaterareatypeAction {
	
	WaterareatypeService waterareatypeService;
	List<Waterareatype> waterareatypes;
	
	public WaterareatypeService getWaterareatypeService() {
		return waterareatypeService;
	}
	public void setWaterareatypeService(WaterareatypeService waterareatypeService) {
		this.waterareatypeService = waterareatypeService;
	}
	public List<Waterareatype> getWaterareatypes() {
		return waterareatypes;
	}
	public void setWaterareatypes(List<Waterareatype> waterareatypes) {
		this.waterareatypes = waterareatypes;
	}
	
	public String getWaterareatypeList(){
		System.out.println("getwaterareatypelist+++++++++++++++++++++++++++++++=");
		waterareatypes = waterareatypeService.getWaterareatypeList();
		System.out.println(waterareatypes.get(0).getTxtFunctionAreaName());
		return "LISTJSP";
		
		
	}
	

}
