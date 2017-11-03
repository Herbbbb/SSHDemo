package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.Boat;

public interface BoatDao extends BaseDao<Boat, Integer> {
	List<Boat> findByLaneId(int laneId);
}
