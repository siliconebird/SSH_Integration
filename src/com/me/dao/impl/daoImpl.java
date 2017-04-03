package com.me.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.me.dao.Dao;
import com.me.domain.Person_test;

public class daoImpl extends HibernateDaoSupport implements Dao {
	public void save(Person_test person){
		System.out.println("dao处理中");
		this.getHibernateTemplate().save(person);
	}
}
