package com.hiwater.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hiwater.dao.MaterialDAO;
import com.hiwater.pojo.Material;
import org.springframework.stereotype.Repository;

@Repository
public class MaterialDAOImpl  extends HibernateTemplate  implements MaterialDAO {

	public List<Material> getMaterialList() {
		// TODO Auto-generated method stub
		return (List<Material>) find("from Material");
	}

	public void add(Material m) {
		// TODO Auto-generated method stub
		save(m);

	}

}
