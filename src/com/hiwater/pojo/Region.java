package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Region")
public class Region {
	private String txtRegionCode;
	private String txtRegionName;
	private String txtSpell;
	private String txtComment;
	private String onUser;
	private String offUser;
	private String onIsRoot;
	private String offIsRoot;
	private String hidChildRegionId;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "txtRegionCode")
	public String getTxtRegionCode() {
		return txtRegionCode;
	}
	public void setTxtRegionCode(String txtRegionCode) {
		this.txtRegionCode = txtRegionCode;
	}
	@Column(name = "txtRegionName")
	public String getTxtRegionName() {
		return txtRegionName;
	}
	public void setTxtRegionName(String txtRegionName) {
		this.txtRegionName = txtRegionName;
	}
	@Column(name = "txtSpell")
	public String getTxtSpell() {
		return txtSpell;
	}
	public void setTxtSpell(String txtSpell) {
		this.txtSpell = txtSpell;
	}
	@Column(name = "txtComment")
	public String getTxtComment() {
		return txtComment;
	}
	public void setTxtComment(String txtComment) {
		this.txtComment = txtComment;
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
	@Column(name = "onIsRoot")
	public String getOnIsRoot() {
		return onIsRoot;
	}
	public void setOnIsRoot(String onIsRoot) {
		this.onIsRoot = onIsRoot;
	}
	@Column(name = "offIsRoot")
	public String getOffIsRoot() {
		return offIsRoot;
	}
	public void setOffIsRoot(String offIsRoot) {
		this.offIsRoot = offIsRoot;
	}
	@Column(name = "hidChildRegionId")
	public String getHidChildRegionId() {
		return hidChildRegionId;
	}
	public void setHidChildRegionId(String hidChildRegionId) {
		this.hidChildRegionId = hidChildRegionId;
	}
	
	
}
