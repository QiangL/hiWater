package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pollutantcode")
public class Pollutantcode {
	
	private String TxtPollutantName;
	private String TxtPolNumCode;
	private String TxtEquivalentValue;
	private String TxtExceptionMaxValue;
	private String TxtExceptionMinValue;
	private String TxtLowerLimit;
	private String TxtUpperLimit;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "TxtPollutantName")
	public String getTxtPollutantName() {
		return TxtPollutantName;
	}
	public void setTxtPollutantName(String txtPollutantName) {
		TxtPollutantName = txtPollutantName;
	}
	@Column(name = "TxtPolNumCode")
	public String getTxtPolNumCode() {
		return TxtPolNumCode;
	}
	public void setTxtPolNumCode(String txtPolNumCode) {
		TxtPolNumCode = txtPolNumCode;
	}
	@Column(name = "TxtEquivalentValue")
	public String getTxtEquivalentValue() {
		return TxtEquivalentValue;
	}
	public void setTxtEquivalentValue(String txtEquivalentValue) {
		TxtEquivalentValue = txtEquivalentValue;
	}
	@Column(name = "TxtExceptionMaxValue")
	public String getTxtExceptionMaxValue() {
		return TxtExceptionMaxValue;
	}
	public void setTxtExceptionMaxValue(String txtExceptionMaxValue) {
		TxtExceptionMaxValue = txtExceptionMaxValue;
	}
	@Column(name = "TxtExceptionMinValue")
	public String getTxtExceptionMinValue() {
		return TxtExceptionMinValue;
	}
	public void setTxtExceptionMinValue(String txtExceptionMinValue) {
		TxtExceptionMinValue = txtExceptionMinValue;
	}
	@Column(name = "TxtLowerLimit")
	public String getTxtLowerLimit() {
		return TxtLowerLimit;
	}
	public void setTxtLowerLimit(String txtLowerLimit) {
		TxtLowerLimit = txtLowerLimit;
	}
	public String getTxtUpperLimit() {
		return TxtUpperLimit;
	}
	public void setTxtUpperLimit(String txtUpperLimit) {
		TxtUpperLimit = txtUpperLimit;
	}
	
	

}
