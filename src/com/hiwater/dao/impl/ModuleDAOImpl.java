package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.ModuleDAO;
import com.hiwater.pojo.Module;

public class ModuleDAOImpl extends HibernateTemplate implements ModuleDAO {

	@Override
	public List<Module> getModuleList() {
		// TODO Auto-generated method stub
		return (List<Module>) find("from Module");
	}

	@Override
	public void add(Module m) {
		// TODO Auto-generated method stub
save(m);
	}

}
