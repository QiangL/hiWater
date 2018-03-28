package com.hiwater.dao;

import java.util.List;
import com.hiwater.pojo.IndustryType;

public interface IndustryTypeDAO {
	
	public List<IndustryType> getIndustryTypeList();

	public void add(IndustryType it);

}
