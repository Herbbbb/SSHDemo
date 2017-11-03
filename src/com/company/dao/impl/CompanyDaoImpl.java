package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.CompanyDao;
import com.company.dao.pojo.Company;
@Repository("companyDao")
public class CompanyDaoImpl implements CompanyDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public void save(Company t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(t);
	}

	@Override
	public void update(Company t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(t);

	}

	@Override
	public void delete(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Company company = (Company) session.get(Company.class, k);
		session.delete(company);
	}

	@Override
	public Company findById(Integer k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Company company = (Company) session.get(Company.class, k);
		return company;
	}

	@Override
	public List<Company> findAll() throws Exception {
		@SuppressWarnings("unchecked")
		List<Company> companyList = sessionFactory.getCurrentSession().createQuery("from Company").list();
		return companyList;
	}

}
