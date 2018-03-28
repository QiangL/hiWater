package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Application;

public interface ApplicationDAO {

	public List<Application> getApplicationList();

	public void add(Application a);

}
