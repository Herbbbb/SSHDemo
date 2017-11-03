package com.company.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.company.dao.idao.CargoDao;
import com.company.dao.pojo.Cargo;
import com.company.service.iservice.CargoService;

@Service("cargoService")
public class CargoServiceImpl implements CargoService {

	@Autowired
	@Qualifier("cargoDao")
	private CargoDao cargoDao;
	@Transactional
	@Override
	public String save(Cargo t) {
		String msg = "error";
		try {
			cargoDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String update(Cargo t) {
		String msg = "error";
		try {
			cargoDao.update(t);
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
			cargoDao.delete(k);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public Cargo findById(Integer k) {
		Cargo cargo = null;
		try {
			cargo = cargoDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cargo;
	}
	@Transactional
	@Override
	public List<Cargo> findAll() {
		List<Cargo> cargoList = null;
		try {
			cargoList = cargoDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cargoList;
	}

}
