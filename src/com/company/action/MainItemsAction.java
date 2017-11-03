package com.company.action;

import java.util.List;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.company.dao.pojo.Lane;
import com.company.service.iservice.LaneService;
import com.opensymphony.xwork2.ModelDriven;

import sun.applet.resources.MsgAppletViewer;

@Controller("mainItemsAction")
@Scope("prototype")
public class MainItemsAction implements ModelDriven<Lane>{

	@Autowired
	@Qualifier("laneService")
	private LaneService laneService;
	
	public String findAll(){
		String msg = "error";
		//获取航线
		List<Lane> lists = laneService.findAll();
		//获取船只信息
		
		
		if(lists != null){
			msg = "success";
			ServletActionContext.getRequest().setAttribute("lists", lists);
		}
		return msg;
	}

	@Override
	public Lane getModel() {
		// TODO Auto-generated method stub
		return null;
	}
}
