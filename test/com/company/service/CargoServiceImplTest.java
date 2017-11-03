package com.company.service;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.company.dao.pojo.Cargo;
import com.company.service.iservice.CargoService;

public class CargoServiceImplTest {

	ApplicationContext ctx;
	CargoService cargoService;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		cargoService = (CargoService) ctx.getBean("cargoService");
	}
	

	@After
	public void tearDown() throws Exception {
		ctx = null;
	}

	@Test
	public void testSave() {
		Cargo cargo = new Cargo("衣服",888.88,new Date(),new Date());
		String msg = cargoService.save(cargo);
		System.out.println(msg);
	}

	@Test
	public void testUpdate() {
		Cargo cargo = cargoService.findById(1);
		cargo.setUpdateTime(new Date());
		cargoService.update(cargo);
		testFindAll();
	}

	@Test
	public void testDelete() {
		cargoService.delete(1);
		testFindAll();
	}

	@Test
	public void testFindById() {
		Cargo cargo = cargoService.findById(1);
		System.out.println(cargo);
	}

	@Test
	public void testFindAll() {
		List<Cargo> lists = cargoService.findAll();
		for(Cargo cargo : lists){
			System.out.println(cargo);
		}
	}

}
