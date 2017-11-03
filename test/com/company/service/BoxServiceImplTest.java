package com.company.service;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.company.dao.pojo.Box;
import com.company.service.iservice.BoxService;

public class BoxServiceImplTest {

	ApplicationContext ctx;
	BoxService boxService;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		boxService = (BoxService) ctx.getBean("boxService");
	}

	@After
	public void tearDown() throws Exception {
		ctx = null;
	}

	@Test
	public void testSave() {
		Box box = new Box(190000,"large",new Date(),new Date());
		String msg = boxService.save(box);
		System.out.println(msg);
		testFindAll();
	}

	@Test
	public void testUpdate() {
		Box box = boxService.findById(1);
		box.setUpdateTime(new Date());
		testFindAll();
	}

	@Test
	public void testDelete() {
		boxService.delete(1);
		testFindAll();
	}

	@Test
	public void testFindById() {
		Box box = boxService.findById(1);
		System.out.println(box);
	}

	@Test
	public void testFindAll() {
		List<Box> lists = boxService.findAll();
		for(Box box : lists){
			System.out.println(box);
		}
	}

}
