package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Code")
public class Code {

	private String ID;
	private String CodeText;
	private String CodeValue;
	private String ParentID;
	private String OrderNum;
	private String Quotiety;
	private String IsSystem;
	private String IsLeaf;

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ID")
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	@Column(name = "CodeText")
	public String getCodeText() {
		return CodeText;
	}
	public void setCodeText(String codeText) {
		CodeText = codeText;
	}
	@Column(name = "CodeValue")
	public String getCodeValue() {
		return CodeValue;
	}
	public void setCodeValue(String codeValue) {
		CodeValue = codeValue;
	}
	@Column(name = "ParentID")
	public String getParentID() {
		return ParentID;
	}
	public void setParentID(String parentID) {
		ParentID = parentID;
	}
	@Column(name = "OrderNum")
	public String getOrderNum() {
		return OrderNum;
	}
	public void setOrderNum(String orderNum) {
		OrderNum = orderNum;
	}
	@Column(name = "Quotiety")
	public String getQuotiety() {
		return Quotiety;
	}
	public void setQuotiety(String quotiety) {
		Quotiety = quotiety;
	}
	@Column(name = "IsSystem")
	public String getIsSystem() {
		return IsSystem;
	}
	public void setIsSystem(String isSystem) {
		IsSystem = isSystem;
	}
	@Column(name = "IsLeaf")
	public String getIsLeaf() {
		return IsLeaf;
	}
	public void setIsLeaf(String isLeaf) {
		IsLeaf = isLeaf;
	}
	
	
}
