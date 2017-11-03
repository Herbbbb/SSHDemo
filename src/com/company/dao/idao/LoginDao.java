package com.company.dao.idao;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

public interface LoginDao extends BaseDao<Login, Integer> {
	//用户登录
	String login(Login login) throws Exception;
	//用户注册
	void registry(Login login, Detail detail) throws Exception;
	//用户信息修改
	void updateUser(Login login, Detail detail) throws Exception;
}
