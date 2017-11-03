package com.company.service.iservice;

import java.util.List;

public interface BaseService<T, K> {
	String save(T t);
	String update(T t);
	String delete(K k);
	T findById(K k);
	List<T> findAll();
}
