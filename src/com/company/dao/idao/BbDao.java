package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.Bb;

public interface BbDao extends BaseDao<Bb, Integer> {
	List<Bb> findByBoatId(int boatId) throws Exception;
}
