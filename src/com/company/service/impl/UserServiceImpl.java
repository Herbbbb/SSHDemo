package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.LoginDao;
import com.company.service.dto.ov.User;
import com.company.service.iservice.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired()
	@Qualifier("loginDao")
	private LoginDao loginDao;
	@Transactional
	@Override
	public String login(User user) {
		String msg = "";
		try {
			msg = loginDao.login(user.getLogin());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String registry(User user) {
		String msg = "error";
		try {
			loginDao.registry(user.getLogin(), user.getDetail());
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	@Override
	public String save(User t) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String update(User t) {
		String msg = "error";
		try {
			loginDao.updateUser(t.getLogin(), t.getDetail());
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Override
	public String delete(Integer k) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User findById(Integer k) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
