package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class Role {

	private String Id;
	private String RoleName;
	private String Description;
	private String ApplicationId;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "Id")
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Column(name = "RoleName")
	public String getRoleName() {
		return RoleName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
	@Column(name = "Description")
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Column(name = "ApplicationId")
	public String getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}

}
