package com.company.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.company.dao.idao.DetailDao;
import com.company.dao.pojo.Detail;
import com.company.service.iservice.DetailService;

@Service("detailService")
public class DetailServiceImpl implements DetailService {

	@Autowired
	@Qualifier("detailDao")
	private DetailDao detailDao;
	@Transactional
	@Override
	public String save(Detail t) {
		String msg = "error";
		try {
			detailDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String update(Detail t) {
		String msg = "error";
		try {
			detailDao.update(t);
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
			detailDao.delete(k);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public Detail findById(Integer k) {
		Detail detail = null;
		try {
			detail = detailDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return detail;
	}
	@Transactional
	@Override
	public List<Detail> findAll() {
		List<Detail> detailList = null;
		try {
			detailList = detailDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return detailList;
	}

}
