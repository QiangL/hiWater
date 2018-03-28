package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Module")
public class Module {
	
	
	private String Id;
	private String ApplicationID;
	private String ParentId;
	private String Cname;
	private String Ename;
	private String Directory;
	private String OrderNum;
	private String IsSystem;
	private String IsClose;
	private String ConfigString;
	private String Remark;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Id")
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Column(name = "ApplicationID")
	public String getApplicationID() {
		return ApplicationID;
	}
	public void setApplicationID(String applicationID) {
		ApplicationID = applicationID;
	}
	@Column(name = "ParentId")
	public String getParentId() {
		return ParentId;
	}
	public void setParentId(String parentId) {
		ParentId = parentId;
	}
	@Column(name = "Cname")
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	@Column(name = "Ename")
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	@Column(name = "Directory")
	public String getDirectory() {
		return Directory;
	}
	public void setDirectory(String directory) {
		Directory = directory;
	}
	@Column(name = "OrderNum")
	public String getOrderNum() {
		return OrderNum;
	}
	public void setOrderNum(String orderNum) {
		OrderNum = orderNum;
	}
	@Column(name = "IsSystem")
	public String getIsSystem() {
		return IsSystem;
	}
	public void setIsSystem(String isSystem) {
		IsSystem = isSystem;
	}
	@Column(name = "IsClose")
	public String getIsClose() {
		return IsClose;
	}
	public void setIsClose(String isClose) {
		IsClose = isClose;
	}
	@Column(name = "ConfigString")
	public String getConfigString() {
		return ConfigString;
	}
	public void setConfigString(String configString) {
		ConfigString = configString;
	}
	@Column(name = "Remark")
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	
	
	
}
