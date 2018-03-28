package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Psgroupview;
import com.hiwater.service.PsgroupviewService;

public class PsgroupviewAction {
	
	 PsgroupviewService  psgroupviewService;
	 List<Psgroupview>  psgroupviews;
	 
	public PsgroupviewService getPsgroupviewService() {
		return psgroupviewService;
	}
	public void setPsgroupviewService(PsgroupviewService psgroupviewService) {
		this.psgroupviewService = psgroupviewService;
	}
	public List<Psgroupview> getPsgroupviews() {
		return psgroupviews;
	}
	public void setPsgroupviews(List<Psgroupview> psgroupviews) {
		this.psgroupviews = psgroupviews;
	}
	
	public String getPsgroupviewList() {
		System.out.println("getPsgroupviewlist+++++++++++++++++++++++++++++++=");
		psgroupviews = psgroupviewService.getPsgroupviewList();
		System.out.println(psgroupviews.get(0).getStatus());
		return "LISTJSP";
	}

}
