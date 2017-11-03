package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.Box;

public interface BoxDao extends BaseDao<Box, Integer> {
	List<Box> findByBoatId(int boatId) throws Exception;
}
