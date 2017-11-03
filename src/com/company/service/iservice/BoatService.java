package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Boat;

public interface BoatService extends BaseService<Boat, Integer> {
	List<Boat> findByLaneId(int laneId);
	
}
