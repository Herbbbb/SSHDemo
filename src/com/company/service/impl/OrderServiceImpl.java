package com.company.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.company.dao.idao.OrderDao;
import com.company.dao.pojo.Order;
import com.company.service.iservice.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	@Qualifier("orderDao")
	private OrderDao orderDao;
	@Transactional
	@Override
	public String save(Order t) {
		String msg = "error";
		try {
			orderDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String update(Order t) {
		String msg = "error";
		try {
			orderDao.update(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String delete(Integer k) {
		String msg = "error";
		try {
			orderDao.delete(k);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public Order findById(Integer k) {
		Order order = null;
		try {
			order = orderDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}
	@Transactional
	@Override
	public List<Order> findAll() {
		List<Order> orderList = null;
		try {
			orderList = orderDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderList;
	}

}
