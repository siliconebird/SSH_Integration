package com.me.dao;

import java.io.Serializable;
import java.util.List;

import com.me.domain.Department;
import com.me.domain.Person_test;

public interface Dao {

	void save(Person_test person);
		//查询所有成员
		List<Department> findAllDeps();
		//保存成员
		void insetDep(Department dep);
		//根据id查询一个成员
		Department getDep(Serializable id);
		//update一个成员
		void updateDep(Department dep);
		//删除一个成员
		void removeDep(Department dep);
	
}
