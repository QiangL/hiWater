package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Navigation")
public class Navigation {
	

	private String Id;
	private String Text;
	private String IsReset;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Id")
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Column(name = "Text")
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	@Column(name = "IsReset")
	public String getIsReset() {
		return IsReset;
	}
	public void setIsReset(String isReset) {
		IsReset = isReset;
	}
	
	
	

}
