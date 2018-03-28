package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Application")
public class Application {
	private String Id;
	private String CName;
	private String EName;
	private String AccessUrl;
	private String CacheUrl;
	private String ReloadUrl;
	private String Remark;
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
	@Column(name = "CName")  
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	@Column(name = "EName")
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	@Column(name = "AccessUrl")
	public String getAccessUrl() {
		return AccessUrl;
	}
	public void setAccessUrl(String accessUrl) {
		AccessUrl = accessUrl;
	}
	@Column(name = "CacheUrl")
	public String getCacheUrl() {
		return CacheUrl;
	}
	public void setCacheUrl(String cacheUrl) {
		CacheUrl = cacheUrl;
	}
	@Column(name = "ReloadUrl")
	public String getReloadUrl() {
		return ReloadUrl;
	}
	public void setReloadUrl(String reloadUrl) {
		ReloadUrl = reloadUrl;
	}
	@Column(name = "Remark")
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	@Column(name = "ApplicationPath")
	public String getApplicationPath() {
		return ApplicationPath;
	}
	public void setApplicationPath(String applicationPath) {
		ApplicationPath = applicationPath;
	}

}
