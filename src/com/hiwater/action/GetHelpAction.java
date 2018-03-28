package com.hiwater.action;

import java.util.HashMap;
import java.util.Map;

public class GetHelpAction {

	private String node;
	private Map<String, Object> dataMap;
	
	public String getNode() {
		return node;
	}
	public void setNode(String node) {
		this.node = node;
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	
	public String getHelp() {
		dataMap = new HashMap<String, Object>();
		
		dataMap.put("id","1849289b-7b12-4dfe-a6cd-8fb836671805");
		dataMap.put("text","系统简介");
		dataMap.put("parentId",null);
		dataMap.put("leaf",false);
		dataMap.put("expanded",false);
		dataMap.put("expandable",true);
		dataMap.put("children",new HashMap<String, Object>());
		System.out.println("aaaaa");
		return "success";
		
		
	}

}
