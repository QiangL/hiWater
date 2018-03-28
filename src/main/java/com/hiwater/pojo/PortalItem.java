package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PortalItem")
public class PortalItem {
	
	private String Id;
	private String PortalId;
	private String ColIndex;
	private String OrderNum;
	private String Height;
	private String Visiable;
	private String Name;
	private String Url;
	private String Icon;
	private String ModuleId;
	private String ApplicationPath;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Id")
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Column(name = "PortalId")
	public String getPortalId() {
		return PortalId;
	}
	public void setPortalId(String portalId) {
		PortalId = portalId;
	}
	@Column(name = "ColIndex")
	public String getColIndex() {
		return ColIndex;
	}
	public void setColIndex(String colIndex) {
		ColIndex = colIndex;
	}
	@Column(name = "OrderNum")
	public String getOrderNum() {
		return OrderNum;
	}
	public void setOrderNum(String orderNum) {
		OrderNum = orderNum;
	}
	@Column(name = "Height")
	public String getHeight() {
		return Height;
	}
	public void setHeight(String height) {
		Height = height;
	}
	@Column(name = "Visiable")
	public String getVisiable() {
		return Visiable;
	}
	public void setVisiable(String visiable) {
		Visiable = visiable;
	}
	@Column(name = "Name")
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	@Column(name = "Icon")
	public String getIcon() {
		return Icon;
	}
	public void setIcon(String icon) {
		Icon = icon;
	}
	@Column(name = "ModuleId")
	public String getModuleId() {
		return ModuleId;
	}
	public void setModuleId(String moduleId) {
		ModuleId = moduleId;
	}
	@Column(name = "ApplicationPath")
	public String getApplicationPath() {
		return ApplicationPath;
	}
	public void setApplicationPath(String applicationPath) {
		ApplicationPath = applicationPath;
	}
	
	
	
}
