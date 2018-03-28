package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Material")
public class Material {
	
	private String Status;
	private String txtAuxiliaryMaterialsName;
	private String txtProperties;
	private String onUser;
	private String offUser;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Status")
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Column(name = "txtAuxiliaryMaterialsName")
	public String getTxtAuxiliaryMaterialsName() {
		return txtAuxiliaryMaterialsName;
	}
	public void setTxtAuxiliaryMaterialsName(String txtAuxiliaryMaterialsName) {
		this.txtAuxiliaryMaterialsName = txtAuxiliaryMaterialsName;
	}
	@Column(name = "txtProperties")
	public String getTxtProperties() {
		return txtProperties;
	}
	public void setTxtProperties(String txtProperties) {
		this.txtProperties = txtProperties;
	}
	@Column(name = "onUser")
	public String getOnUser() {
		return onUser;
	}
	public void setOnUser(String onUser) {
		this.onUser = onUser;
	}
	@Column(name = "offUser")
	public String getOffUser() {
		return offUser;
	}
	public void setOffUser(String offUser) {
		this.offUser = offUser;
	}
	
	

}
