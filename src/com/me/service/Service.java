package com.me.service;

import java.io.Serializable;
import java.util.List;

import com.me.domain.Department;
import com.me.domain.Person_test;

public interface Service {
	void serviceSave(Person_test person);
	//查询所有成员
	List<Department> showDeps();
	//保存成员
	void saveDep(Department dep);
	//根据id查询一个成员
	Department findDep(Serializable id);
	//update一个成员
	void updateDep(Department dep);
	//删除一个成员
	void delDep(Department dep);
}
