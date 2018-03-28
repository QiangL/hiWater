package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Action")
public class Action {
	
	private String Id;
	private String ModuleId;
	private String DefaultAuthorize;
	private String Remark;
	private String ActionCode;
	private String CName;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Id") 
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Column(name = "ModuleId") 
	public String getModuleId() {
		return ModuleId;
	}
	public void setModuleId(String moduleId) {
		ModuleId = moduleId;
	}
	@Column(name = "DefaultAuthorize") 
	public String getDefaultAuthorize() {
		return DefaultAuthorize;
	}
	public void setDefaultAuthorize(String defaultAuthorize) {
		DefaultAuthorize = defaultAuthorize;
	}
	@Column(name = "Remark") 
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	@Column(name = "ActionCode") 
	public String getActionCode() {
		return ActionCode;
	}
	public void setActionCode(String actionCode) {
		ActionCode = actionCode;
	}
	@Column(name = "CName") 
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	
	

}
