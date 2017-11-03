package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.BoatDao;
import com.company.dao.pojo.Boat;
import com.company.dao.pojo.Lane;
@Repository("boatDao")
public class BoatDaoImpl implements BoatDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public void save(Boat t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(t);
	}

	@Override
	public void update(Boat t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(t);

	}

	@Override
	public void delete(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Boat boat = (Boat) session.get(Boat.class, k);
		session.delete(boat);
	}

	@Override
	public Boat findById(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Boat boat = (Boat) session.get(Boat.class, k);
		return boat;
	}

	@Override
	public List<Boat> findAll() throws Exception {
		@SuppressWarnings("unchecked")
		List<Boat> boatList = sessionFactory.getCurrentSession().createQuery("from Boat").list();
		return boatList;
	}

	@Override
	public List<Boat> findByLaneId(int laneId) {
		Session session = sessionFactory.getCurrentSession();
		Lane lane = (Lane) session.get(Lane.class, laneId);
		System.out.println(lane);
		@SuppressWarnings("unchecked")
		List<Boat> boatList = sessionFactory.getCurrentSession().createQuery("from Boat b where b.lane = ?").setParameter(0, lane).list();
		return boatList;
	}

}
