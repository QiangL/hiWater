package com.hiwater.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hiwater.dao.UserDAO;
import com.hiwater.pojo.User;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	public String execute() throws Exception {
		System.out.println("struts==========================");
		
		return "success";

	}
}
