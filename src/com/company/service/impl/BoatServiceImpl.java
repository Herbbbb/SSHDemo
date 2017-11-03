package com.company.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.BoatDao;
import com.company.dao.pojo.Boat;
import com.company.service.iservice.BoatService;
@Repository("boatService")
public class BoatServiceImpl implements BoatService {
	@Autowired
	@Qualifier("boatDao")
	private BoatDao boatDao;
	@Transactional
	@Override
	public String save(Boat t) {
		String msg = "error";
		try {
			boatDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String update(Boat t) {
		String msg = "error";
		try {
			boatDao.update(t);
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
			boatDao.delete(k);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public Boat findById(Integer k) {
		Boat boat = null;
		try {
			boat = boatDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boat;
	}
	@Transactional
	@Override
	public List<Boat> findAll() {
		List<Boat> boatList = null;
		try {
			boatList = boatDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boatList;
	}
	@Transactional
	@Override
	public List<Boat> findByLaneId(int laneId) {
		List<Boat> boatList = boatDao.findByLaneId(laneId);
		return boatList;
	}
}
