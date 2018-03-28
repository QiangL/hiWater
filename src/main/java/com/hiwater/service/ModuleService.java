package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.Module;

public interface ModuleService {
	
	public void addModule(Module m);
	public List<Module> getModuleList();

}
