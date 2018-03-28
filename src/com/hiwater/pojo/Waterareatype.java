package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Waterareatype")
public class Waterareatype {
	
	private String txtFunctionAreaCode;
	private String txtFunctionAreaName;
	private String txtComment;
	private String txtSpell;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "txtFunctionAreaCode")
	public String getTxtFunctionAreaCode() {
		return txtFunctionAreaCode;
	}
	public void setTxtFunctionAreaCode(String txtFunctionAreaCode) {
		this.txtFunctionAreaCode = txtFunctionAreaCode;
	}
	@Column(name = "txtFunctionAreaName")
	public String getTxtFunctionAreaName() {
		return txtFunctionAreaName;
	}
	public void setTxtFunctionAreaName(String txtFunctionAreaName) {
		this.txtFunctionAreaName = txtFunctionAreaName;
	}
	@Column(name = "txtComment")
	public String getTxtComment() {
		return txtComment;
	}
	public void setTxtComment(String txtComment) {
		this.txtComment = txtComment;
	}
	@Column(name = "txtSpell")
	public String getTxtSpell() {
		return txtSpell;
	}
	public void setTxtSpell(String txtSpell) {
		this.txtSpell = txtSpell;
	}
	
	
}
