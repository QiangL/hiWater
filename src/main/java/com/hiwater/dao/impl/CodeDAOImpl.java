package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.CodeDAO;
import com.hiwater.pojo.BelongType;
import com.hiwater.pojo.Code;
import org.springframework.stereotype.Repository;

@Repository
public class CodeDAOImpl extends HibernateTemplate implements CodeDAO {

	public List<Code> getCodeList() {
		// TODO Auto-generated method stub
		return (List<Code>) find("from Code");
	}

	public void add(Code c) {
		// TODO Auto-generated method stub
		save(c);

	}

}
