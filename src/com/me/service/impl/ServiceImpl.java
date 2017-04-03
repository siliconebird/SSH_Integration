package com.me.service.impl;

import com.me.dao.Dao;
import com.me.domain.Person_test;
import com.me.service.Service;

public class ServiceImpl implements Service{
	Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	public void serviceSave(Person_test person){
		System.out.println("service处理中");
		this.dao.save(person);
	}
}
