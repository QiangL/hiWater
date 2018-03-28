package com.hiwater.action;

import java.util.List;

import com.hiwater.pojo.Module;
import com.hiwater.service.ModuleService;

public class ModuleAction {
	ModuleService moduleService;
	List<Module> modules;
	
	public ModuleService getModuleService() {
		return moduleService;
	}
	public void setModuleService(ModuleService moduleService) {
		this.moduleService = moduleService;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	public String getModuleList() {
			System.out.println("getModulelist+++++++++++++++++++++++++++++++=");
			modules = moduleService.getModuleList();
			System.out.println(modules.get(0).getApplicationID());
			return "LISTJSP";

	}

}
