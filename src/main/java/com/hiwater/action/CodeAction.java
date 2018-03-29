package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Code;
import com.hiwater.service.CodeService;

public class CodeAction {
	CodeService codeService;
	List<Code> codes;

	public CodeService getcodeService() {
		return codeService;
	}

	public void setCodeService(CodeService codeService) {
		this.codeService = codeService;
	}

	public List<Code> getCodes() {
		return codes;
	}

	public void setCodes(List<Code> codes) {
		this.codes = codes;
	}

	public String getCodeList() {
		System.out.println("getCodelist+++++++++++++++++++++++++++++++=");
		codes = codeService.getCodeList();
		System.out.println(codes.get(0).getID());
		return "LISTJSP";

	}

}
