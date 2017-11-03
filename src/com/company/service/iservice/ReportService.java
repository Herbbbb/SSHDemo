package com.company.service.iservice;

import java.util.List;
import com.company.service.dto.result.DetailInfo;

public interface ReportService {
	
	//销量最佳详情-JSON字符串
	String reportSalInfo();
	String reportBoatInfo();
	List<DetailInfo> reportDetailInfo();
}
