package com.hiwater.service;

import java.util.List;

import com.hiwater.pojo.Online;

public interface OnlineService {
	
	public void addNavigation(Online o);
	public List<Online> getOnlineList();

}
