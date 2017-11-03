package com.company.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SessionFactoryTest {
	ApplicationContext ctx;
	SessionFactory sessionFactory;
	@Before
	public void setUp(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");
	}
	@After
	public void setDown(){
		ctx = null;
	}
	@Test
	public void sessionFactoryTest(){
		System.out.println(sessionFactory);
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		System.out.println(session);
		trans.commit();
		session.close();
		sessionFactory.close();
	}
}
