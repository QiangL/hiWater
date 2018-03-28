package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.CodeDAO;
import com.hiwater.pojo.Code;
import com.hiwater.service.CodeService;

public class CodeServiceImpl implements CodeService {

	CodeDAO codeDAO;
	
	public CodeDAO getCodeDAO() {
		return codeDAO;
	}

	public void setCodeDAO(CodeDAO codeDAO) {
		this.codeDAO = codeDAO;
	}

	@Override
	public void addCode(Code c) {
		// TODO Auto-generated method stub
		codeDAO.add(c);
		
	}

	@Override
	public List<Code> getCodeList() {
		// TODO Auto-generated method stub
		List<Code> codes=codeDAO.getCodeList();
		return codes;
	}

}
