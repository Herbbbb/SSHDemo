package com.company.dao.idao;

import java.util.List;

public interface BaseDao<T, K> {
	//增
	void save(T t) throws Exception;
	//改
	void update(T t) throws Exception;
	//删
	void delete(K k) throws Exception;
	//ID查询
	T findById(K k) throws Exception;
	//查询所有
	List<T> findAll() throws Exception;
}
