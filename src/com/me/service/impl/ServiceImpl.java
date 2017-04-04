package com.me.service.impl;

import java.io.Serializable;
import java.util.List;

import com.me.dao.Dao;
import com.me.domain.Department;
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
	//查找所有成员
	@Override
	public List<Department> showDeps() {
		return dao.findAllDeps();
	}
	//保存一个成员
	@Override
	public void saveDep(Department dep) {
		this.dao.insetDep(dep);
	}
	//查找一个成员
	@Override
	public Department findDep(Serializable id) {
		return this.dao.getDep(id);
	}
	//升级一个成员
	@Override
	public void updateDep(Department dep) {
		this.dao.updateDep(dep);
	}
	//删除一个成员
	@Override
	public void delDep(Department dep) {
		this.dao.removeDep(dep);
	}
}
