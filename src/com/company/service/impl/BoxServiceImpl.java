package com.company.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.company.dao.idao.BoxDao;
import com.company.dao.pojo.Box;
import com.company.service.iservice.BoxService;

@Service("boxService")
public class BoxServiceImpl implements BoxService {

	@Autowired
	@Qualifier("boxDao")
	private BoxDao boxDao;
	
	@Transactional
	@Override
	public String save(Box t) {
		String msg = "error";
		try {
			boxDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String update(Box t) {
		String msg = "error";
		try {
			boxDao.update(t);
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
			boxDao.delete(k);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public Box findById(Integer k) {
		Box box = null;
		try {
			box = boxDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return box;
	}
	@Transactional
	@Override
	public List<Box> findAll() {
		List<Box> boxList = null;
		try {
			boxList = boxDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boxList;
	}
	@Transactional
	@Override
	public List<Box> findByBoatId(int boatId) {
		List<Box> boxList = null;
		try {
			boxList = boxDao.findByBoatId(boatId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boxList;
	}

}
