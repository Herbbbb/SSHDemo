package com.company.action;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.company.service.dto.result.DetailInfo;
import com.company.service.iservice.ReportService;
import freemarker.template.Configuration;
import freemarker.template.Template;

@Controller("reportAction")
public class ReportAction {
	
	@Autowired
	private ReportService reportService;
	
	//销售情况最佳对应详情
	public void getSalReport(){
		String msg = reportService.reportSalInfo();
		try {
			ServletActionContext.getResponse().getWriter().println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//路线最多对应船只详情
	public void getBoatReport(){
		String msg1 = reportService.reportBoatInfo();
		System.out.println(msg1);
		try {
			ServletActionContext.getResponse().getWriter().println(msg1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//freemaker生成一个HTML页面
	@SuppressWarnings("deprecation")
	public String getDetailInfo(){
		List<DetailInfo> lists = reportService.reportDetailInfo();
		Map<String,Object> map = new HashMap<String,Object>();
	
		map.put("lists", lists);
		try {
            Configuration config = new Configuration();
            config.setDefaultEncoding("UTF-8");
            //ftl文件路径
            config.setDirectoryForTemplateLoading(new File("E:/workspace/SSHDemo3.0/src/com/company/dao"));
            Template template = config.getTemplate("sty.ftl");
            //生成的html文件路径
            template.process(map,new FileWriter("E:/workspace/SSHDemo3.0/WebContent/WEB-INF/views/freemake.html"));
            Thread.sleep(3000);
//            TemplateSaveEvent evt = new TemplateSaveEvent();
//            evt.setTemplateName(templateName);
//            dispatchTemplateEvent(evt);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } 
		return "success";
	}
}
