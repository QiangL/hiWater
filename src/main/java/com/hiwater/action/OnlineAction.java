package com.hiwater.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hiwater.pojo.Online;
import com.hiwater.service.OnlineService;

public class OnlineAction {

	OnlineService onlineService;
	List<Online> onlines;

	private Map<String, Object> dataMap;

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public OnlineService getOnlineService() {
		return onlineService;
	}

	public void setOnlineService(OnlineService onlineService) {
		this.onlineService = onlineService;
	}

	public List<Online> getOnlines() {
		return onlines;
	}

	public void setOnlines(List<Online> onlines) {
		this.onlines = onlines;
	}

	public String getOnlineList() {

		dataMap = new HashMap<String, Object>();
		dataMap.put("data", onlines);

		System.out.println("getOnlinelist+++++++++++++++++++++++++++++++=");
		onlines = onlineService.getOnlineList();
		System.out.println(onlines.get(0).getId());
		return "LISTJSP";

	}

}
