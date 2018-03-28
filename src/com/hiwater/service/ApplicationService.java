package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.Application;

public interface ApplicationService {
	public void addApplication(Application a);
	public List<Application> getApplicationList();

}
