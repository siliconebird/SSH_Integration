package com.me.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.me.dao.Dao;
import com.me.domain.Department;
import com.me.domain.Person_test;

public class daoImpl extends HibernateDaoSupport implements Dao {
	public void save(Person_test person){
		System.out.println("dao处理中");
		this.getHibernateTemplate().save(person);
	}
	//查找所有成员
	@Override
	public List<Department> findAllDeps() {
		return this.getHibernateTemplate().find("from Department");
	}
	//插入一个成员
	@Override
	public void insetDep(Department dep) {
		this.getHibernateTemplate().save(dep);
	}
	
	//根据id查找一个成员
	@Override
	public Department getDep(Serializable id) {
		return (Department) this.getHibernateTemplate().get(Department.class, id);
	}
	//升级一个成员
	@Override
	public void updateDep(Department dep) {
		this.getHibernateTemplate().update(dep);
	}
	//删除一个成员
	@Override
	public void removeDep(Department dep) {
		this.getHibernateTemplate().delete(dep);
	}
}
