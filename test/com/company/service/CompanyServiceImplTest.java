package com.company.service;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.company.dao.pojo.Company;
import com.company.service.iservice.CompanyService;

public class CompanyServiceImplTest {
	
	ApplicationContext ctx;
	CompanyService companyService;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		companyService = (CompanyService) ctx.getBean("companyService");
	}

	@After
	public void tearDown() throws Exception {
		ctx = null;
	}

	@Test
	public void testSave() {
		Company company = new Company("大连船舶集团",new Date(),new Date());
		companyService.save(company);
		testFindAll();
	}

	@Test
	public void testUpdate() {
		Company company = companyService.findById(1);
		company.setUpdateTime(new Date());
		companyService.update(company);
		testFindAll();
	}

	@Test
	public void testDelete() {
		companyService.delete(1);
		testFindAll();
	}

	@Test
	public void testFindById() {
		Company company = companyService.findById(1);
		System.out.println(company);
	}

	@Test
	public void testFindAll() {
		List<Company> lists = companyService.findAll();
		for(Company company : lists){
			System.out.println(company);
		}
	}

}
