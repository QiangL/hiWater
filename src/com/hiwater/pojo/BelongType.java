package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BelongType")
public class BelongType {
	
	private String txtBelongTypeCode;
	private String txtBelongTypeName;
	private String txtUnitPrice;
	private String txtSpell;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "txtBelongTypeCode")
	public String getTxtBelongTypeCode() {
		return txtBelongTypeCode;
	}
	public void setTxtBelongTypeCode(String txtBelongTypeCode) {
		this.txtBelongTypeCode = txtBelongTypeCode;
	}
	@Column(name = "txtBelongTypeName")
	public String getTxtBelongTypeNamee() {
		return txtBelongTypeName;
	}
	public void setTxtBelongTypeNamee(String txtBelongTypeName) {
		this.txtBelongTypeName = txtBelongTypeName;
	}
	@Column(name = "txtUnitPrice")
	public String getTxtUnitPrice() {
		return txtUnitPrice;
	}
	public void setTxtUnitPrice(String txtUnitPrice) {
		this.txtUnitPrice = txtUnitPrice;
	}
	@Column(name = "txtSpell")
	public String getTxtSpell() {
		return txtSpell;
	}
	public void setTxtSpell(String txtSpell) {
		this.txtSpell = txtSpell;
	}
	

}
