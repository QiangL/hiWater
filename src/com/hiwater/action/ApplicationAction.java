package com.hiwater.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hiwater.pojo.Application;
import com.hiwater.service.ApplicationService;

import net.sf.json.JSONArray;

public class ApplicationAction {
	 private Map<String,Object> dataMap;

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	ApplicationService applicationService;
	List<Application> applications;

	public ApplicationService getApplicationService() {
		return applicationService;
	}

	public void setApplicationService(ApplicationService applicationService) {
		this.applicationService = applicationService;
	}

	public List<Application> getApplicaions() {
		System.out.println("ssss");
		return applications;
	}

	public void setApplicaions(List<Application> applicaions) {
		this.applications = applicaions;
	}

	public String getApplicationList() {
		
        dataMap = new HashMap<String, Object>();  
        dataMap.put("data", applications); 

		System.out.println("getApplicationlist+++++++++++++++++++++++++++++++=");
		applications = applicationService.getApplicationList();
		System.out.println(applications.get(0).getRemark());
		JSONArray jsonArray = JSONArray.fromObject(applications);
		String returnString = jsonArray.toString();
		System.out.println(returnString);
		return "success";

	}

}
