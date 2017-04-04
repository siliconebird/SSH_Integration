package com.me.action;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.me.domain.Department;
import com.me.service.Service;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DepAction extends ActionSupport implements ModelDriven<Department>{
	private Service service;
	private Department dep = new Department();
	
	public Department getModel() {
		// TODO Auto-generated method stub
		return dep;
	}
	public void setService(Service service) {
		this.service = service;
	}
	//展示所有成员
	public String show(){
		List<Department> list = service.showDeps();
		ActionContext.getContext().put("department", list);
		return "showAction";
	}
	//查找一个成员
	public String findDep(){
		Department depart = service.findDep(this.dep.getDid());
		ActionContext.getContext().getValueStack().push(depart);
		return "findOneAction";
	}
	
	public String updateDep(){
		Department depart = service.findDep(this.dep.getDid());
		BeanUtils.copyProperties(dep, depart);
		service.updateDep(depart);
		return"chainAction";
	}
	public String saveDep(){
		Department depart = new Department();
		BeanUtils.copyProperties(dep, depart);
		service.saveDep(depart);
		return "saveAction";
	}
	public String delDep(){
		Department depart = service.findDep(this.dep.getDid());
		service.delDep(depart);
		return "delAction";
	}
}
