package com.company.service;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Lane;
import com.company.service.iservice.LaneService;

public class LaneServiceImplTest {
	LaneService laneService;
	ApplicationContext ctx;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		laneService = (LaneService) ctx.getBean("laneService");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() {
		Lane lane = new Lane("大连", "烟台", 300, 0, new Date(), null);
		String msg = laneService.save(lane);
		System.out.println(msg);
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
		List<Lane> laneList = laneService.findAll();
		System.out.println(laneList);
	}

}
