package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Pollutanttype;
import com.hiwater.service.PollutanttypeService;

public class PollutanttypeAction {
	
	PollutanttypeService pollutanttypeService;
	List<Pollutanttype> pollutanttypes;
	

	public PollutanttypeService getPollutanttypeService() {
		return pollutanttypeService;
	}


	public void setPollutanttypeService(PollutanttypeService pollutanttypeService) {
		this.pollutanttypeService = pollutanttypeService;
	}


	public List<Pollutanttype> getPollutanttypes() {
		return pollutanttypes;
	}


	public void setPollutanttypes(List<Pollutanttype> pollutanttypes) {
		this.pollutanttypes = pollutanttypes;
	}


	public String getPollutanttypeList() {
		System.out.println("getPollutanttypeslist+++++++++++++++++++++++++++++++=");
		pollutanttypes = pollutanttypeService.getPollutanttypeList();
		System.out.println(pollutanttypes.get(0).getTxtComment());
		return "LISTJSP";

	}



}
