package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Module;

public interface ModuleDAO {
	
	public List<Module> getModuleList();
	public void add(Module m);

}
