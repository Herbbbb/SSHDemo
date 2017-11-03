package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.DetailDao;
import com.company.dao.pojo.Detail;
@Repository("detailDao")
public class DetailDaoImpl implements DetailDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public void save(Detail t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(t);
	}

	@Override
	public void update(Detail t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(t);

	}

	@Override
	public void delete(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Detail detail = (Detail) session.get(Detail.class, k);
		session.delete(detail);
	}

	@Override
	public Detail findById(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Detail detail = (Detail) session.get(Detail.class, k);
		return detail;
	}

	@Override
	public List<Detail> findAll() throws Exception {
		@SuppressWarnings("unchecked")
		List<Detail> detailList = sessionFactory.getCurrentSession().createQuery("from Detail").list();
		return detailList;
	}
}
