package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.OrderDao;
import com.company.dao.pojo.Order;
@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public void save(Order t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(t);
	}

	@Override
	public void update(Order t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(t);

	}

	@Override
	public void delete(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Order order = (Order) session.get(Order.class, k);
		session.delete(order);
	}

	@Override
	public Order findById(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Order order = (Order) session.get(Order.class, k);
		return order;
	}

	@Override
	public List<Order> findAll() throws Exception {
		@SuppressWarnings("unchecked")
		List<Order> orderList = sessionFactory.getCurrentSession().createQuery("from Order").list();
		return orderList;
	}

}
