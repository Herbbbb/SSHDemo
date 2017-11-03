package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.LaneDao;
import com.company.dao.pojo.Lane;
import com.company.service.iservice.LaneService;
@Service("laneService")
public class LaneServiceImpl implements LaneService {
	@Autowired
	@Qualifier("laneDao")
	private LaneDao laneDao;
	@Transactional
	@Override
	public String save(Lane t) {
		String msg = "error";
		try {
			laneDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String update(Lane t) {
		String msg = "error";
		try {
			laneDao.update(t);
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
			laneDao.delete(k);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public Lane findById(Integer k) {
		Lane lane = null;
		try {
			lane = laneDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lane;
	}
	@Transactional
	@Override
	public List<Lane> findAll() {
		List<Lane> laneList = null;
		try {
			laneList = laneDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return laneList;
	}

}
