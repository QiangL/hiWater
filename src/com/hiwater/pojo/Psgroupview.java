package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Psgroupview")
public class Psgroupview {
	
	private String Status;
	private String txtGroupName;
	private String txtMemo;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Status")
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Column(name = "txtGroupName")
	public String getTxtGroupName() {
		return txtGroupName;
	}
	public void setTxtGroupName(String txtGroupName) {
		this.txtGroupName = txtGroupName;
	}
	@Column(name = "txtMemo")
	public String getTxtMemo() {
		return txtMemo;
	}
	public void setTxtMemo(String txtMemo) {
		this.txtMemo = txtMemo;
	}
	
	

}
