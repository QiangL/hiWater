package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Pollutantcode;
import com.hiwater.service.PollutantcodeService;

public class PollutantcodeAction {
	
	PollutantcodeService pollutantcodeService;
	List<Pollutantcode> pollutantcodes;
	
	public PollutantcodeService getPollutantcodeService() {
		return pollutantcodeService;
	}


	public void setPollutantcodeService(PollutantcodeService pollutantcodeService) {
		this.pollutantcodeService = pollutantcodeService;
	}


	public List<Pollutantcode> getPollutantcodes() {
		return pollutantcodes;
	}


	public void setPollutantcodes(List<Pollutantcode> pollutantcodes) {
		this.pollutantcodes = pollutantcodes;
	}


	public String getPollutantcodeList() {
		System.out.println("getPollutantcodelist+++++++++++++++++++++++++++++++=");
		pollutantcodes = pollutantcodeService.getPollutantcodeList();
		System.out.println(pollutantcodes.get(0).getTxtEquivalentValue());
		return "LISTJSP";

	}


}
