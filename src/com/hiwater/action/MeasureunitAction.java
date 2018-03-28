package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Measureunit;
import com.hiwater.service.MeasureunitService;

public class MeasureunitAction {
	
	MeasureunitService measureunitService;
	List<Measureunit> measureunits;
	
	public MeasureunitService getMeasureunitService() {
		return measureunitService;
	}

	public void setMeasureunitService(MeasureunitService measureunitService) {
		this.measureunitService = measureunitService;
	}

	public List<Measureunit> getMeasureunits() {
		return measureunits;
	}

	public void setMeasureunits(List<Measureunit> measureunits) {
		this.measureunits = measureunits;
	}

	public String getMeasureunitList() {
		System.out.println("getMeasureunitlist+++++++++++++++++++++++++++++++=");
		measureunits = measureunitService.getMeasureunitList();
		System.out.println(measureunits.get(0).getTxtComment());
		return "LISTJSP";
	}

}
