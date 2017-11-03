package com.company.service.iservice;

import com.company.service.dto.ov.User;

public interface UserService extends BaseService<User, Integer> {
	//用户登录
	String login(User user);
	//用户注册
	String registry(User user);
	
}
