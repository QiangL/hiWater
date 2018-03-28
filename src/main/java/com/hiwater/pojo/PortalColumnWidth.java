package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PortalColumnWidth")
public class PortalColumnWidth {
	
	private String ColumnNumber;
	private String ColumnWidthPercent;
	private String PortalId;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ColumnNumber")
	public String getColumnNumber() {
		return ColumnNumber;
	}
	public void setColumnNumber(String columnNumber) {
		ColumnNumber = columnNumber;
	}
	@Column(name = "ColumnWidthPercent")
	public String getColumnWidthPercent() {
		return ColumnWidthPercent;
	}
	public void setColumnWidthPercent(String columnWidthPercent) {
		ColumnWidthPercent = columnWidthPercent;
	}
	@Column(name = "PortalId")
	public String getPortalId() {
		return PortalId;
	}
	public void setPortalId(String portalId) {
		PortalId = portalId;
	}
	
	
	

}
