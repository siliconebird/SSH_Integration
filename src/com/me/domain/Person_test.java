package com.me.domain;

import java.io.Serializable;

public class Person_test implements Serializable {
	private Integer pid;
	private String name;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
