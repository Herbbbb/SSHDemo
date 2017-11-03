package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.LaneDao;
import com.company.dao.pojo.Lane;
@Repository("laneDao")
public class LaneDaoImpl implements LaneDao{
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public void save(Lane t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(t);
	}

	@Override
	public void update(Lane t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(t);
	}

	@Override
	public void delete(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Lane lane = (Lane) session.get(Lane.class, k);
		session.delete(lane);
	}

	@Override
	public Lane findById(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Lane lane = (Lane) session.get(Lane.class, k);
		return lane;
	}

	@Override
	public List<Lane> findAll() throws Exception {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Lane> laneList = session.createQuery("from Lane").list();
		System.out.println(laneList + "=======");
		return laneList;
	}

}
