package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Portal")
public class Portal {

	private String Id;
	private String ColumnWidths;
	private String Widths;
	private String Namev;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Id")
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Column(name = "ColumnWidths")
	public String getColumnWidths() {
		return ColumnWidths;
	}
	public void setColumnWidths(String columnWidths) {
		ColumnWidths = columnWidths;
	}
	@Column(name = "Widths")
	public String getWidths() {
		return Widths;
	}
	public void setWidths(String widths) {
		Widths = widths;
	}
	@Column(name = "Namev")
	public String getNamev() {
		return Namev;
	}
	public void setNamev(String namev) {
		Namev = namev;
	}
	
	
	
}
