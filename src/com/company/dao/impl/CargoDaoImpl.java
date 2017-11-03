package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.CargoDao;
import com.company.dao.pojo.Cargo;
@Repository("cargoDao")
public class CargoDaoImpl implements CargoDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public void save(Cargo t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(t);
	}

	@Override
	public void update(Cargo t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(t);

	}

	@Override
	public void delete(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Cargo cargo = (Cargo) session.get(Cargo.class, k);
		session.delete(cargo);
	}

	@Override
	public Cargo findById(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Cargo cargo = (Cargo) session.get(Cargo.class, k);
		return cargo;
	}

	@Override
	public List<Cargo> findAll() throws Exception {
		@SuppressWarnings("unchecked")
		List<Cargo> cargoList = sessionFactory.getCurrentSession().createQuery("from Cargo").list();
		return cargoList;
	}

}
