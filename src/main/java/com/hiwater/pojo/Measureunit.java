package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Measureunit")
public class Measureunit {
	
	private String txtMeasureUnitCode;
	private String txtMeasureUnitName;
	private String txtUnitSymbol;
	private String txtComment;
	private String txtSpell;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "txtMeasureUnitCode")
	public String getTxtMeasureUnitCode() {
		return txtMeasureUnitCode;
	}
	public void setTxtMeasureUnitCode(String txtMeasureUnitCode) {
		this.txtMeasureUnitCode = txtMeasureUnitCode;
	}
	@Column(name = "txtMeasureUnitName")
	public String getTxtMeasureUnitName() {
		return txtMeasureUnitName;
	}
	public void setTxtMeasureUnitName(String txtMeasureUnitName) {
		this.txtMeasureUnitName = txtMeasureUnitName;
	}
	@Column(name = "txtUnitSymbol")
	public String getTxtUnitSymbol() {
		return txtUnitSymbol;
	}
	public void setTxtUnitSymbol(String txtUnitSymbol) {
		this.txtUnitSymbol = txtUnitSymbol;
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
