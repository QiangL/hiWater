package com.hiwater.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Log")
public class Log {
	
	private String Id;
	private String UserId;
	private String DtDate;
	private String Thread;
	private String LogLevel;
	private String Logger;
	private String Message;
	private String Exception;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Id")
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Column(name = "UserId")
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	@Column(name = "DtDate")
	public String getDtDate() {
		return DtDate;
	}
	public void setDtDate(String dtDate) {
		DtDate = dtDate;
	}
	@Column(name = "Thread")
	public String getThread() {
		return Thread;
	}
	public void setThread(String thread) {
		Thread = thread;
	}
	@Column(name = "LogLevel")
	public String getLogLevel() {
		return LogLevel;
	}
	public void setLogLevel(String logLevel) {
		LogLevel = logLevel;
	}
	@Column(name = "Logger")
	public String getLogger() {
		return Logger;
	}
	public void setLogger(String logger) {
		Logger = logger;
	}
	@Column(name = "Message")
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@Column(name = "Exception")
	public String getException() {
		return Exception;
	}
	public void setException(String exception) {
		Exception = exception;
	}
	
	

}
