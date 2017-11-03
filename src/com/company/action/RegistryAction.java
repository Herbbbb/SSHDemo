package com.company.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.company.service.dto.ov.User;
import com.company.service.iservice.UserService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("registryAction")
public class RegistryAction implements ModelDriven<User>{
	
	User userModel = new User();
	@Override
	public User getModel() {
		return userModel;
	}
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	public String RegisterUser(){
		String msg = userService.registry(userModel);
		return msg;
	}

	
	
}
