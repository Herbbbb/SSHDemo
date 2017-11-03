package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.BbDao;
import com.company.dao.pojo.Bb;
import com.company.dao.pojo.Boat;
@Repository("bbDao")
public class BbDaoImpl implements BbDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public void save(Bb t) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Bb t) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer k) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Bb findById(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bb> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bb> findByBoatId(int boatId) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Boat boat = (Boat) session.get(Boat.class, boatId);
		@SuppressWarnings("unchecked")
		List<Bb> bbList = session.createQuery("from Bb b where b.boat=?").setParameter(0, boat).list();
		return bbList;
	}

}
