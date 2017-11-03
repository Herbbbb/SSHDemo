package com.company.service;

import static org.junit.Assert.fail;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Bb;
import com.company.dao.pojo.Login;
import com.company.dao.pojo.Order;
import com.company.service.iservice.OrderService;

public class OrderServiceImplTest {

	ApplicationContext ctx;
	OrderService orderService;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		orderService = (OrderService) ctx.getBean("orderService");
	}
	@After
	public void tearDown() throws Exception {
		ctx = null;
	}

	@Test
	public void testSave() {
		Order order = new Order(1,"衣服", 19, new Date(), null);
		SessionFactory sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		Login login = (Login) session.get(Login.class, 1);
		Bb bb = (Bb) session.get(Bb.class, 1);
		order.setBb(bb);
		order.setLoginId(login.getLoginId());
		orderService.save(order);
		trans.commit();
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

}
