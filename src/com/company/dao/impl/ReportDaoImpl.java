package com.company.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.company.dao.idao.ReportDao;
import com.company.service.dto.result.BoatInfo;
import com.company.service.dto.result.DetailInfo;
import com.company.service.dto.result.SalInfo;

@Repository("reportDao")
public class ReportDaoImpl implements ReportDao{

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SalInfo> reportSalInfo() throws Exception {
		Session session = (Session) sessionFactory.getCurrentSession();
		//选择出售数量BOX最多的详细信息
		String sql ="SELECT "
				+ "companyName,boatName,boatPrice,SALESAMOUNT,sTime,eTime,startLocation, endLocation ,lanePrice "
				+ "FROM("
				+ "(SELECT COMPANYID aid, COMPANYNAME companyName "
				+ "FROM company) a,"
				+ "(SELECT BOATID bid ,BOATNAME boatName,BOATPRICE boatPrice,STARTTIME "
				+ "sTime,ENDTIEM eTime,COMPANYID bcid ,LANEID blid "
				+ "FROM boat) b,"
				+ "(SELECT BOATID eid,SALESAMOUNT "
				+ "FROM bb "
				+ "WHERE "
				+ "bb.SALESAMOUNT = "
				+ "(SELECT MAX(SALESAMOUNT) "
				+ "FROM bb)) e,"
				+ "(SELECT LANEID fid ,STRARTLOCATION startLocation,ENDLOACTION endLocation,LANEPRICE lanePrice "
				+ "FROM lane) f)"
				+ "WHERE "
				+ "b.bid=e.eid "
				+ "AND "
				+ "a.aid=b.bcid "
				+ "AND "
				+ "b.blid=f.fid;";
		SQLQuery query = session.createSQLQuery(sql);
		query.addScalar("companyName");
		query.addScalar("boatName");
		query.addScalar("boatPrice");
		query.addScalar("SALESAMOUNT");
		query.addScalar("sTime");
		query.addScalar("sTime");
		query.addScalar("eTime");
		query.addScalar("startLocation");
		query.addScalar("endLocation");
		query.addScalar("lanePrice");
		query.setResultTransformer(Transformers.aliasToBean(SalInfo.class));
		List<SalInfo> lists = new ArrayList<SalInfo>();
		lists = session.createSQLQuery(sql).list();
		return lists;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BoatInfo> reportBoatInfo() throws Exception {
		Session session = (Session) sessionFactory.getCurrentSession();
		//查询线路上船只最多的线路上的船
		//找出每条航线上 alid 的船只数count
		String sql ="SELECT "
				+ "f.comname comname,e.BOATNAME boatName,e.BOATPRICE price ,"
				+ "E.STARTTIME startTime,E.ENDTIEM endTime "
				+ "FROM ("
				+ "(SELECT b.blid id "
				+ "FROM(( SELECT MAX(a.alid) lid "
				+ "FROM( "
				+ "(SELECT LANEID alid, COUNT( * ) AS COUNT  "
				+ "FROM boat  "
				+ "GROUP BY LANEID  "
				+ "ORDER BY COUNT DESC) a ) )c,"
				+ "(SELECT BOATID blid,LANEID lid "
				+ "FROM boat) b)"
				+ "WHERE c.lid=b.lid) d,"
				+ "(SELECT BOATID boid ,BOATNAME,BOATPRICE,COMPANYID ,STARTTIME,ENDTIEM	"
				+ "FROM boat) e,"
				+ "(SELECT COMPANYID comid,COMPANYNAME comname "
				+ "FROM company) f)"
				+ "WHERE e.boid=d.id "
				+ "AND "
				+ "f.comid=e.COMPANYID";
		SQLQuery query = session.createSQLQuery(sql);
		query.addScalar("comname");
		query.addScalar("boatName");
		query.addScalar("price");
		query.addScalar("startTime");
		query.addScalar("endTime");
		query.setResultTransformer(Transformers.aliasToBean(BoatInfo.class));
		List<BoatInfo> lists = new ArrayList<BoatInfo>();
		lists = session.createSQLQuery(sql).list();
		return lists;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DetailInfo> reportDetailInfo() throws Exception {
		Session session = sessionFactory.getCurrentSession();
		String sql = "SELECT "
				+ "REALNAME realName , BALANCE balance "
				+ "FROM detail "
				+ "WHERE CREATETIME "
				+ "BETWEEN '2001-01-01 01:01:01' "
				+ "AND '2017-10-31 23:59:59'";
		SQLQuery query = session.createSQLQuery(sql);
		query.addScalar("realName");
		query.addScalar("balance");
		query.setResultTransformer(Transformers.aliasToBean(DetailInfo.class));
		List<DetailInfo> lists = new ArrayList<DetailInfo>();
		lists = query.list();
		return lists;
	}

}
