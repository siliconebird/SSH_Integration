package com.me.test;

import org.junit.Test;
import org.springframework.orm.hibernate3.HibernateTransactionManager;

public class sessionFactoryTest extends SpringUtil{
	@Test
	public void sessionFactoryBuild(){
			System.out.println(SpringUtil.context.getBean("sessionFactory"));
	}
}
