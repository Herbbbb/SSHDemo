package com.company.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Lane;
import com.company.service.iservice.LaneService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("laneAction")
@Scope("prototype")
public class LaneAction implements RequestAware, ModelDriven<Lane>{
	@Autowired
	@Qualifier("laneService")
	private LaneService laneService;
	private Lane laneModel = new Lane();
	@Override
	public Lane getModel() {
		return laneModel;
	}
	private Map<String, Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}
	public String findAll(){
		List<Lane> laneList = laneService.findAll();
		if(laneList.size() > 0){
			requestMap.put("laneList", laneList);
			return "success";
		}else {
			return "error";
		}
	}
}
