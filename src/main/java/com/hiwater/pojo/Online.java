package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Online")
public class Online {
	
	private String Id;
	private String UserID;
	private String SessionID;
	private String UserName;
	private String Ip;
	private String LoginTime;
	private String LastTime;
	private String LastUrl;
	private String Offline;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Id")
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Column(name = "UserID")
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	@Column(name = "SessionID")
	public String getSessionID() {
		return SessionID;
	}
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}
	@Column(name = "UserName")
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	@Column(name = "Ip")
	public String getIp() {
		return Ip;
	}
	public void setIp(String ip) {
		Ip = ip;
	}
	@Column(name = "LoginTime")
	public String getLoginTime() {
		return LoginTime;
	}
	public void setLoginTime(String loginTime) {
		LoginTime = loginTime;
	}
	@Column(name = "LastTime")
	public String getLastTime() {
		return LastTime;
	}
	public void setLastTime(String lastTime) {
		LastTime = lastTime;
	}
	@Column(name = "LastUrl")
	public String getLastUrl() {
		return LastUrl;
	}
	public void setLastUrl(String lastUrl) {
		LastUrl = lastUrl;
	}
	@Column(name = "Offline")
	public String getOffline() {
		return Offline;
	}
	public void setOffline(String offline) {
		Offline = offline;
	}
	
	
	
}
