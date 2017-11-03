package com.company.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Bb;
import com.company.service.iservice.BbService;
import com.opensymphony.xwork2.ModelDriven;
@Controller("bbAction")
@Scope("prototype")
public class BbAction implements RequestAware, ModelDriven<Bb>{
	private Bb bb = new Bb();
	@Override
	public Bb getModel() {
		return bb;
	}
	private Map<String, Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}
	@Autowired
	@Qualifier("bbService")
	private BbService bbService;
	private int boatId;
	public int getBoatId() {
		return boatId;
	}
	public void setBoatId(int boatId) {
		this.boatId = boatId;
	}
	public String findByBoatId(){
		List<Bb> bbList = bbService.findByBoatId(boatId);
		if(bbList.size() > 0){
			requestMap.put("bbList", bbList);
			return "success";
		}else {
			return "error";
		}
	}
}
