package com.company.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.BoxDao;
import com.company.dao.pojo.Bb;
import com.company.dao.pojo.Boat;
import com.company.dao.pojo.Box;
@Repository("boxDao")
public class BoxDaoImpl implements BoxDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public void save(Box t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(t);
	}

	@Override
	public void update(Box t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(t);
	}

	@Override
	public void delete(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Box box = (Box) session.get(Box.class, k);
		session.delete(box);
	}

	@Override
	public Box findById(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Box box = (Box) session.get(Box.class, k);
		return box;
	}

	@Override
	public List<Box> findAll() throws Exception {
		@SuppressWarnings("unchecked")
		List<Box> boxList = sessionFactory.getCurrentSession().createQuery("from Box").list();
		return boxList;
	}

	@Override
	public List<Box> findByBoatId(int boatId) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Boat boat = (Boat) session.get(Boat.class, boatId);
		@SuppressWarnings("unchecked")
		List<Bb> bbList = session.createQuery("from Bb b where b.boat=?").setParameter(0, boat).list();
		List<Box> boxList = new ArrayList<>();
		for (Bb bb : bbList) {
			boxList.add(bb.getBox());
		}
		return boxList;
	}

}
