package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.ApplicationDAO;
import com.hiwater.pojo.Application;
import com.hiwater.service.ApplicationService;

public class ApplicationServiceImpl implements ApplicationService {
	
	ApplicationDAO applicationDAO;

	public ApplicationDAO getApplicationDAO() {
		return applicationDAO;
	}

	public void setApplicationDAO(ApplicationDAO applicationDAO) {
		this.applicationDAO = applicationDAO;
	}

	public void addApplication(Application a) {
		// TODO Auto-generated method stub
		applicationDAO.add(a);

	}
	public List<Application> getApplicationList() {
		// TODO Auto-generated method stub
		return applicationDAO.getApplicationList();
	}

}
