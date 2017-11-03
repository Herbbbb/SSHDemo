package com.company.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Boat;
import com.company.service.iservice.BoatService;
import com.opensymphony.xwork2.ModelDriven;
@Controller("boatAction")
@Scope("prototype")
public class BoatAction implements RequestAware, ModelDriven<Boat> {
	@Autowired
	@Qualifier("boatService")
	private BoatService boatService;
	private Boat boatModel = new Boat();
	@Override
	public Boat getModel() {
		return boatModel;
	}
	private Map<String, Object> requestMap;
	private int laneId;
	
	
	public int getLaneId() {
		return laneId;
	}
	public void setLaneId(int laneId) {
		this.laneId = laneId;
	}
	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}
	public String findAll(){
		List<Boat> boatList = boatService.findAll();
		if(boatList.size() > 0){
			requestMap.put("boatList", boatList);
			return "success";
		}else {
			return "error";
		}
	}
	public String findByLaneId(){
		List<Boat> boatList = boatService.findByLaneId(laneId);
		if(boatList.size() > 0){
			requestMap.put("boatList", boatList);
			return "success";
		}else {
			requestMap.put("boatList", boatList);
			return "error";
		}
	}
	

}
