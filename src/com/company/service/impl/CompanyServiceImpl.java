package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.CompanyDao;
import com.company.dao.pojo.Company;
import com.company.service.iservice.CompanyService;
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	@Qualifier("companyDao")
	private CompanyDao companyDao;
	@Transactional
	@Override
	public String save(Company t) {
		String msg = "error";
		try {
			companyDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String update(Company t) {
		String msg = "error";
		try {
			companyDao.update(t);
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
			companyDao.delete(k);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public Company findById(Integer k) {
		Company company = null;
		try {
			company = companyDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return company;
	}
	@Transactional
	@Override
	public List<Company> findAll() {
		List<Company> companyList = null;
		try {
			companyList = companyDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return companyList;
	}

}
