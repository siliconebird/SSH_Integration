package com.me.test;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.BeanUtils;

import com.me.domain.Department;
import com.me.domain.Person_test;
import com.me.service.Service;

public class HibernateTransactonTest extends SpringUtil{
	@Test
	public void test(){
		Service ser = (Service)context.getBean("service");
		List<Department> list = ser.showDeps();
		for(Department dep:list){
			System.out.println(dep.getName());
		}
	}
	
	@Test
	public void test2(){
		Service ser = (Service)context.getBean("service");
		Department dep = ser.findDep(2);
		System.out.println(dep.getName());
	}
	
	@Test
	public void test3(){
		Service ser = (Service)context.getBean("service");
		Department dep = new Department();
		dep.setName("采购部");
		dep.setDescription("采购东西");
		ser.saveDep(dep);
	}
	@Test
	public void test4() throws IllegalAccessException, InvocationTargetException{
		Service ser = (Service)context.getBean("service");
		Department dep = ser.findDep(1);
		System.out.println(dep.getName()+"__"+dep.getDescription());
		Department depNew = new Department();
		depNew.setDid(1);
		depNew.setName("研发部部");
		depNew.setDescription("研发一些东西");
		BeanUtils.copyProperties(depNew, dep);
		ser.updateDep(dep);
	}
	@Test
	public void test5(){
		Service ser = (Service)context.getBean("service");
		Department dep = ser.findDep(3);
		ser.delDep(dep);
	}
}
