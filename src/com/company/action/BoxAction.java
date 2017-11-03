package com.company.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Box;
import com.company.service.iservice.BoxService;
import com.opensymphony.xwork2.ModelDriven;
@Controller("boxAction")
@Scope("prototype")
public class BoxAction implements RequestAware, ModelDriven<Box> {
	@Autowired
	@Qualifier("boxService")
	private BoxService boxService;
	private Box boxModel = new Box();
	@Override
	public Box getModel() {
		
		return boxModel;
	}
	private Map<String, Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}
	private int boatId;
	public int getBoatId() {
		return boatId;
	}
	public void setBoatId(int boatId) {
		this.boatId = boatId;
	}
	public String findByBoatId(){
		return null;
	}

}
