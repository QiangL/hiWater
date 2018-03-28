package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pollutanttype")
public class Pollutanttype {
	
	private String txtpollutanttypeCode;
	private String txtpollutanttypeName;
	private String txtSpell;
	private String txtComment;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "txtpollutanttypeCode")
	public String getTxtpollutanttypeCode() {
		return txtpollutanttypeCode;
	}
	public void setTxtpollutanttypeCode(String txtpollutanttypeCode) {
		this.txtpollutanttypeCode = txtpollutanttypeCode;
	}
	@Column(name = "txtpollutanttypeName")
	public String getTxtpollutanttypeName() {
		return txtpollutanttypeName;
	}
	public void setTxtpollutanttypeName(String txtpollutanttypeName) {
		this.txtpollutanttypeName = txtpollutanttypeName;
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
	
	

}
