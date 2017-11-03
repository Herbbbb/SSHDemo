package com.company.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.company.dao.idao.ReportDao;
import com.company.service.dto.result.BoatInfo;
import com.company.service.dto.result.DetailInfo;
import com.company.service.dto.result.SalInfo;
import com.company.service.iservice.ReportService;
import com.google.gson.Gson;

@Repository("reportService")
public class ReportServiceImpl implements ReportService{

	@Autowired
	@Qualifier("reportDao")
	private ReportDao reportDao;
	Gson gson = new Gson();
	String gsonStr = null;
	@Transactional
	@Override
	public String reportSalInfo() {
		try {
			List<SalInfo> lists = reportDao.reportSalInfo();
			gsonStr = gson.toJson(lists);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gsonStr;
	}
	@Transactional
	@Override
	public String reportBoatInfo() {
		try {
			List<BoatInfo> lists = reportDao.reportBoatInfo();
			gsonStr = gson.toJson(lists);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gsonStr;
	}
	@Transactional
	@Override
	public List<DetailInfo> reportDetailInfo() {
		List<DetailInfo> lists = null;
		try {
			 lists = reportDao.reportDetailInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lists;
	}

}
