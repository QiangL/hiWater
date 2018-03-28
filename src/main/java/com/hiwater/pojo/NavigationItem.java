package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NavigationItem")
public class NavigationItem {

	
	private String Id;
	private String NavigationId;
	private String ModuleId;
	private String Name;
	private String Url;
	private String ParentId;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Id")
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Column(name = "NavigationId")
	public String getNavigationId() {
		return NavigationId;
	}
	public void setNavigationId(String navigationId) {
		NavigationId = navigationId;
	}
	@Column(name = "ModuleId")
	public String getModuleId() {
		return ModuleId;
	}
	public void setModuleId(String moduleId) {
		ModuleId = moduleId;
	}
	@Column(name = "Name")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Column(name = "Url")
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	@Column(name = "ParentId")
	public String getParentId() {
		return ParentId;
	}
	public void setParentId(String parentId) {
		ParentId = parentId;
	}
	
	
	
}
