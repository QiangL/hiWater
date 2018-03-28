package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.OnlineDAO;
import com.hiwater.pojo.Online;
import org.springframework.stereotype.Repository;

@Repository
public class OnlineDAOImpl  extends HibernateTemplate implements OnlineDAO {

	public List<Online> getOnlineList() {
		// TODO Auto-generated method stub
		return (List<Online>) find("from Online");
	}

	public void add(Online o) {
		// TODO Auto-generated method stub
		save(o);

	}

}
