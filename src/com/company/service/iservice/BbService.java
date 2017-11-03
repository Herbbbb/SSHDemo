package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Bb;

public interface BbService extends BaseService<Bb, Integer> {
	List<Bb> findByBoatId(int boatId);
}
