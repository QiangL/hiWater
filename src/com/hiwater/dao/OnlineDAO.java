package com.hiwater.dao;

import java.util.List;

import com.hiwater.pojo.Online;

public interface OnlineDAO {
	
	public List<Online> getOnlineList();
	public void add(Online o);

}
