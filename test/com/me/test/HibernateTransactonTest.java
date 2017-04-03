package com.me.test;

import org.junit.Test;

import com.me.domain.Person_test;
import com.me.service.Service;

public class HibernateTransactonTest extends SpringUtil{
	@Test
	public void test(){
		Service ser = (Service)context.getBean("service");
		Person_test p = new Person_test();
		p.setName("hahaming");
		ser.serviceSave(p);
	}
}
