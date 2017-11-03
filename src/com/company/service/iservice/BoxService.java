package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Box;

public interface BoxService extends BaseService<Box, Integer> {
	List<Box> findByBoatId(int boatId);
}
