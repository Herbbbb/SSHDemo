package com.company.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.LoginDao;
import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;
@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public void save(Login t) throws Exception {
		
	}

	@Override
	public void update(Login t) throws Exception {
	}

	@Override
	public void delete(Integer k) throws Exception {
	}

	@Override
	public Login findById(Integer k) throws Exception {
		return null;
	}

	@Override
	public List<Login> findAll() throws Exception {
		return null;
	}

	@Override
	public String login(Login login) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Login result = (Login) session.createQuery("from Login log where log.username=? and log.password=?")
				.setParameter(0, login.getUsername())
				.setParameter(1, login.getPassword())
				.uniqueResult();
		return result != null ? "success" : "error";
	}

	@Override
	public void registry(Login login, Detail detail) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		detail.setLogin(login);
		Date date = new Date();
		login.setCreateTime(date);
		detail.setCreateTime(date);
		session.save(login);
		session.save(detail);
	}

	@Override
	public void updateUser(Login login, Detail detail) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Date date = new Date();
		login.setCreateTime(date);
		detail.setCreateTime(date);
		session.update(login);
		session.update(detail);
	}

}
