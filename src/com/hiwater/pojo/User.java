package com.hiwater.pojo;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
@Table(name = "User")
public class User {
	private String Id;
	private String CName;
	private String EName;
	private String LoginName;
	private String Pwd;
	private String Sex;
	private String DateOfBirth;
	private String Extension;
	private String PhotoUrl;
	private String DeptId;
	private String NavigationId;
	private String ApplicationId;
	private String LastUrl;
	private String Theme;
	private String PortalName;
	private String PortalId;
	private String Roles;
	private String Navigation;
	
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
	@Column(name = "LoginName")  
	public String getLoginName() {
		return LoginName;
	}
	public void setLoginName(String loginName) {
		LoginName = loginName;
	}
	@Column(name = "Pwd")  
	public String getPwd() {
		return Pwd;
	}
	public void setPwd(String pwd) {
		Pwd = pwd;
	}
	   @Column(name = "Sex")  
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	@Column(name = "DateOfBirth")  
	public String  getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	@Column(name = "Extension")  
	public String getExtension() {
		return Extension;
	}
	public void setExtension(String extension) {
		Extension = extension;
	}
    @Column(name = "PhotoUrl")  
	public String getPhotoUrl() {
		return PhotoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		PhotoUrl = photoUrl;
	}
	   @Column(name = "DeptId")  
	public String getDeptId() {
		return DeptId;
	}
	public void setDeptId(String deptId) {
		DeptId = deptId;
	}
	   @Column(name = "NavigationId")  
	public String getNavigationId() {
		return NavigationId;
	}
	public void setNavigationId(String navigationId) {
		NavigationId = navigationId;
	}
	@Column(name = "ApplicationId")  
	public String getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}
	@Column(name = "LastUrl")  
	public String getLastUrl() {
		return LastUrl;
	}
	public void setLastUrl(String lastUrl) {
		LastUrl = lastUrl;
	}
	   @Column(name = "Theme")  
	public String getTheme() {
		return Theme;
	}
	public void setTheme(String theme) {
		Theme = theme;
	}
	@Column(name = "PortalName")  
	public String getPortalName() {
		return PortalName;
	}
	public void setPortalName(String portalName) {
		PortalName = portalName;
	}
	@Column(name = "PortalId")  
	public String getPortalId() {
		return PortalId;
	}
	public void setPortalId(String portalId) {
		PortalId = portalId;
	}
	@Column(name = "Roles")  
	public String getRoles() {
		return Roles;
	}
	public void setRoles(String roles) {
		Roles = roles;
	}
	@Column(name = "Navigation")  
	public String getNavigation() {
		return Navigation;
	}
	public void setNavigation(String navigation) {
		Navigation = navigation;
	}

}
