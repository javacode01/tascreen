package com.yawei.service.gsywfh;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yawei.client.gsywfh.McglJbxxZsMapper;
import com.yawei.client.gsywfh.QydjJbxxZsMapper;

@Service
public class GsywssFhService {
	
	@Autowired
	private McglJbxxZsMapper mcglJbxxZsMapper;
	@Autowired
	private QydjJbxxZsMapper qydjJbxxZsMapper;
	
	/**
	 * 获取今日登记排行榜数据
	 * @return
	 */
	public Map<String,Object> getDjphbData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = qydjJbxxZsMapper.selectDjphbData();
		List<String> x_value = new ArrayList<String>();
		List<Integer> y_value = new ArrayList<Integer>();
		for(Map<String,Object> temp:list) {
			x_value.add((String) temp.get("mcjc"));
			y_value.add(((BigDecimal)temp.get("sl")).intValue());
		}
		result.put("x", x_value);
		result.put("y", y_value);
		return result;
	}
	
	/**
	 * 获取名称预核准数据
	 * @return
	 */
	public List<Map<String,Object>> getMcyhzData() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		//初始化查询结果
		for(int i=4;i>0;i--) {
			Map<String,Object> result = new HashMap<String,Object>();
			result.put("nametype", ""+i);
			if(i==1) {
				result.put("nametypeName", "冠区县名");
			}else if(i==2){
				result.put("nametypeName", "冠市名");
			}else if(i==3){
				result.put("nametypeName", "冠省名");
			}else if(i==4){
				result.put("nametypeName", "冠国家名");
			}
			result.put("now", "0");
			result.put("before", "0");
			resultList.add(result);
		}
		List<Map<String,Object>> list = mcglJbxxZsMapper.selectMcyhzData();
		//拼接查询结果
		if(null!=list) {
			Iterator<Map<String,Object>> it = list.iterator();
			while(it.hasNext()) {
				Map<String,Object> temp = it.next();
				for(Map<String,Object> result:resultList) {
					if(result.get("nametype").equals(temp.get("nametype"))) {
						result.put((String) temp.get("datestr"), temp.get("sl"));
						break;
					}
				}
			}
		}
		return resultList;
	}
	
	/**
	 * 获取设立登记数据
	 * @return
	 */
	public List<Map<String,Object>> getSldjData(){
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		//初始化查询结果
		String[] entcats = {"qy","nz","gt"};
		for(String entcat:entcats) {
			Map<String,Object> result = new HashMap<String,Object>();
			result.put("entcat", entcat);
			if("qy".equals(entcat)) {
				result.put("entcatName", "企业");
			}else if("nz".equals(entcat)){
				result.put("entcatName", "农专");
			}else if("gt".equals(entcat)){
				result.put("entcatName", "个体");
			}
			result.put("now", "0");
			result.put("before", "0");
			resultList.add(result);
		}
		List<Map<String,Object>> list = qydjJbxxZsMapper.selectSldjData();
		//拼接查询结果
		if(null!=list) {
			Iterator<Map<String,Object>> it = list.iterator();
			while(it.hasNext()) {
				Map<String,Object> temp = it.next();
				for(Map<String,Object> result:resultList) {
					if(result.get("entcat").equals(temp.get("entcat"))) {
						result.put((String) temp.get("datetype"), temp.get("sl"));
						break;
					}
				}
			}
		}
		return resultList;
	}
	
	/**
	 * 获取其他登记数据
	 * @return
	 */
	public List<Map<String, Object>> getQtdjData() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		//初始化查询结果
		String[] entcats = {"qy","nz","gt"};
		for(String entcat:entcats) {
			Map<String,Object> result = new HashMap<String,Object>();
			result.put("entcat", entcat);
			if("qy".equals(entcat)) {
				result.put("entcatName", "企业");
			}else if("nz".equals(entcat)){
				result.put("entcatName", "农专");
			}else if("gt".equals(entcat)){
				result.put("entcatName", "个体");
			}
			result.put("bgnow", "0");
			result.put("bgbefore", "0");
			result.put("banow", "0");
			result.put("babefore", "0");
			result.put("zxnow", "0");
			result.put("zxbefore", "0");
			resultList.add(result);
		}
		//获取当天变更事项
		List<Map<String,Object>> bgNowList = qydjJbxxZsMapper.selectBgdjNowData();
		if(null!=bgNowList) {
			for(Map<String,Object> temp:bgNowList) {
				for(Map<String,Object> result:resultList) {
					if(result.get("entcat").equals(temp.get("ENTCAT"))) {
						result.put("bgnow", temp.get("SL"));
					}
				}
			}
		}
		//获取前一天变更事项
		List<Map<String,Object>> bgBeforeList = qydjJbxxZsMapper.selectBgdjBeforeData();
		if(null!=bgBeforeList) {
			for(Map<String,Object> temp:bgBeforeList) {
				for(Map<String,Object> result:resultList) {
					if(result.get("entcat").equals(temp.get("ENTCAT"))) {
						result.put("bgbefore", temp.get("SL"));
					}
				}
			}
		}
		//获取备案登记数据
		List<Map<String,Object>> badjList = qydjJbxxZsMapper.selectBadjData();
		//拼接查询结果
		if(null!=badjList) {
			Iterator<Map<String,Object>> it = badjList.iterator();
			while(it.hasNext()) {
				Map<String,Object> temp = it.next();
				for(Map<String,Object> result:resultList) {
					if(result.get("entcat").equals(temp.get("entcat"))) {
						result.put((String) temp.get("datetype"), temp.get("sl"));
						break;
					}
				}
			}
		}
		//获取注销登记数据
		List<Map<String,Object>> zxdjList = qydjJbxxZsMapper.selectZxdjData();
		//拼接查询结果
		if(null!=zxdjList) {
			Iterator<Map<String,Object>> it = zxdjList.iterator();
			while(it.hasNext()) {
				Map<String,Object> temp = it.next();
				for(Map<String,Object> result:resultList) {
					if(result.get("entcat").equals(temp.get("entcat"))) {
						result.put((String) temp.get("datetype"), temp.get("sl"));
						break;
					}
				}
			}
		}
		return resultList;
	}

}
