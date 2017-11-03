package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.BbDao;
import com.company.dao.pojo.Bb;
import com.company.service.iservice.BbService;
@Service("bbService")
public class BbServiceImpl implements BbService {
	@Autowired
	@Qualifier("bbDao")
	private BbDao bbDao;
	@Override
	public String save(Bb t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Bb t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bb findById(Integer k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bb> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public List<Bb> findByBoatId(int boatId) {
		List<Bb> bbList = null;
		try {
			bbList = bbDao.findByBoatId(boatId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bbList;
	}

}
