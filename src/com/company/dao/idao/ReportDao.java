package com.company.dao.idao;

import java.util.List;

import com.company.service.dto.result.BoatInfo;
import com.company.service.dto.result.DetailInfo;
import com.company.service.dto.result.SalInfo;

public interface ReportDao {
	//销量最好相关信息
	List<SalInfo> reportSalInfo() throws Exception;
	//最多船跑的西安路对应船只的相关信息
	List<BoatInfo> reportBoatInfo() throws Exception;
	//freemaker报表
	List<DetailInfo> reportDetailInfo() throws Exception;
}
