package com.hiwater.service.impl;

import java.util.List;

import com.hiwater.dao.OnlineDAO;
import com.hiwater.pojo.Online;
import com.hiwater.service.OnlineService;

public class OnlineServiceImpl implements OnlineService {
	
	OnlineDAO onlineDAO;

	public OnlineDAO getOnlineDAO() {
		return onlineDAO;
	}

	public void setOnlineDAO(OnlineDAO onlineDAO) {
		this.onlineDAO = onlineDAO;
	}

	@Override
	public void addNavigation(Online o) {
		// TODO Auto-generated method stub
		onlineDAO.add(o);

	}

	@Override
	public List<Online> getOnlineList() {
		// TODO Auto-generated method stub
		return onlineDAO.getOnlineList();
	}

}
