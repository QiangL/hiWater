package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.ModuleDAO;
import com.hiwater.pojo.Module;
import com.hiwater.service.ModuleService;

public class ModuleServiceImpl implements ModuleService {
	
	ModuleDAO moduleDAO;

	public ModuleDAO getModuleDAO() {
		return moduleDAO;
	}

	public void setModuleDAO(ModuleDAO moduleDAO) {
		this.moduleDAO = moduleDAO;
	}

	@Override
	public void addModule(Module m) {
		// TODO Auto-generated method stub
		moduleDAO.add(m);

	}

	@Override
	public List<Module> getModuleList() {
		// TODO Auto-generated method stub
		return moduleDAO.getModuleList();
	}

}
