package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Code;

public interface CodeDAO {
	
	public List<Code> getCodeList();
	public void add(Code c);


}
