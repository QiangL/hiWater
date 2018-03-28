package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.Code;

public interface CodeService {
	
	public void addCode(Code c);
	public List<Code> getCodeList();

}
