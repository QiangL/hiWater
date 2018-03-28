package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Valley;
import com.hiwater.service.ValleyService;

public class ValleyAction {
	
	ValleyService valleyService;
	List<Valley> valleys;
	
	public ValleyService getValleyService() {
		return valleyService;
	}
	public void setValleyService(ValleyService valleyService) {
		this.valleyService = valleyService;
	}
	public List<Valley> getValleys() {
		return valleys;
	}
	public void setValleys(List<Valley> valleys) {
		this.valleys = valleys;
	}
	
	public String getValleyList() {
		System.out.println("getValleyslist+++++++++++++++++++++++++++++++=");
		valleys=valleyService.getValleyList();
		System.out.println(valleys.get(0).getTxtComment());
		return "LISTJSP";
	}

}
