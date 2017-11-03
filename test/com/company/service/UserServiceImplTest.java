package com.company.service;


import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;
import com.company.service.dto.ov.User;
import com.company.service.iservice.UserService;

public class UserServiceImplTest {
	UserService userService;
	ApplicationContext ctx;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = (UserService) ctx.getBean("userService");
	}

	@After
	public void tearDown() throws Exception {
		ctx = null;
	}

	@Test
	public void testLogin() {
		Login login = new Login("root", "root");
		User user = new User(login, null);
		String msg = userService.login(user);
		System.out.println(msg);
	}

	@Test
	public void testRegistry() {
		Login login = new Login("root", "root", 0, new Date());
		Detail detail = new Detail("张三", 90000, null, new Date());
		User user = new User(login, detail);
		String msg = userService.registry(user);
		System.out.println(msg + "========");
	}

}
