package com.me.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.me.domain.Person_test;
import com.me.service.Service;
import com.opensymphony.xwork2.ActionSupport;

public class ActionDemo extends ActionSupport {
	Service service;
	String ac;
	
	public void setService(Service service) {
		this.service = service;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String show(){
	   Person_test p = new Person_test();
	   p.setName(ac);
	   service.serviceSave(p);
	   return SUCCESS;
	}
}
