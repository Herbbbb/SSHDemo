package com.company.service;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Boat;
import com.company.service.iservice.BoatService;

public class BoatServiceImplTest {
	
	ApplicationContext ctx;
	BoatService boatService;
	SessionFactory sessionFactory;
	@Before
	public void setUp() throws Exception {
		
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		boatService = (BoatService) ctx.getBean("boatService");
		sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");
		
	}
	@Test
	public void testSessionFactory(){
		Session session = (Session) sessionFactory.openSession();
		System.out.println(session);
	}
	@After
	public void tearDown() throws Exception {
		ctx = null;
	}

	@Test
	public void testSave() {
		Boat boat = new Boat("南极号",new Date(),new Date(),1000.00,0,new Date(),new Date());
		
		String msg = boatService.save(boat);
		System.out.println(msg);
	}
	@Test
	public void testUpdate() {
		Boat boat = boatService.findById(1);
		boat.setBoatName("山东号");
		boat.setUpdateTime(new Date());
		boatService.update(boat);
	}

	@Test
	public void testDelete() {
		String msg = boatService.delete(1);
		System.out.println(msg);
	}

	@Test
	public void testFindById() {
		Boat boat = boatService.findById(1);
		System.out.println(boat);
	}

	@Test
	public void testFindAll() {
		List<Boat> lists = boatService.findAll();
		for(Boat boat : lists){
			System.out.println(boat);
		}
		
	}

}
