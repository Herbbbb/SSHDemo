package com.company.action;

import java.io.IOException;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.service.dto.ov.User;
import com.company.service.iservice.UserService;
import com.opensymphony.xwork2.ModelDriven;
@Controller("userAction")
@Scope("prototype")
public class UserAction implements ModelDriven<User>, SessionAware, RequestAware {
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	public String login(){
		System.out.println(userModel.getLogin());
		String msg = userService.login(userModel);
		if("success".equals(msg)){
			sessionMap.put("user", userModel);
		}else if("error".equals(msg)){
			try {
				ServletActionContext.getResponse().getWriter().println("success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return msg;
	}				
	private User userModel = new User();
	@Override
	public User getModel() {
		return userModel;
	}
	Map<String, Object> sessionMap;
	@Override
	public void setSession(Map<String, Object> arg0) {
		sessionMap = arg0;
	}
	Map<String, Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}
	
}
