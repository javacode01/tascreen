package com.yawei.service.gsyw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.utils.SysUtils;
import com.yawei.client.gsyw.ZtdjJbxxZsMapper;

@Service
public class ScztxxzlService {
	
	@Autowired
	private ZtdjJbxxZsMapper ztdjJbxxZsMapper;
	
	/**
	 * 获取根据类型获取期末和去年同期主体数量
	 * @return
	 */
	public Map<String, Object> getZtzlData(String entcat) {
		// TODO Auto-generated method stub
		Map<String,String> filter = new HashMap<String,String>();
		if(!SysUtils.isNull(entcat)) {
			filter.put("entcat", entcat);
		}
		Map<String,Object> result = ztdjJbxxZsMapper.selectZtzlData(filter);
		BigDecimal qmsl = (BigDecimal) result.get("QMSL");
		BigDecimal qnsl = (BigDecimal) result.get("QNSL");
		BigDecimal tbzz = qmsl.subtract(qnsl).divide(qnsl,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100"));
		result.put("qmsl", qmsl);
		result.put("qnsl", qnsl);
		result.put("tbzz", tbzz.setScale(2, BigDecimal.ROUND_HALF_UP));
		return result;
	}
	
	/**
	 * 获取产业分布数量
	 * @param entcat
	 * @return
	 */
	public List<Map<String,Object>> getCyfbData(String entcat) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		Map<String,String> filter = new HashMap<String,String>();
		if(!SysUtils.isNull(entcat)) {
			filter.put("entcat", entcat);
		}
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectCyfbData(filter);
		for(Map<String,Object> temp:list) {
			Map<String,Object> result = new HashMap<String,Object>();
			result.put("name", temp.get("NAME"));
			result.put("value", temp.get("VALUE"));
			resultList.add(result);
		}
		return resultList;
	}
	
	/**
	 * 获取各区县主体数量
	 * @param entcat
	 * @return
	 */
	public List<Map<String,Object>> getGqxztslData(String entcat) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		Map<String,String> filter = new HashMap<String,String>();
		if(!SysUtils.isNull(entcat)) {
			filter.put("entcat", entcat);
		}
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectGqxztslData(filter);
		for(Map<String,Object> temp:list) {
			Map<String,Object> resultMap = new HashMap<String,Object>(); 
			resultMap.put("name",(String) temp.get("NAME"));
			resultMap.put("value",(BigDecimal) temp.get("VALUE"));
			resultList.add(resultMap);
		}
		return resultList;
	}
	
	/**
	 * 获取类型分布数据
	 * @return
	 */
	public List<Map<String, Object>> getLxfbData() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectLxfbData();
		for(Map<String,Object> temp:list) {
			Map<String,Object> result = new HashMap<String,Object>();
			result.put("name", temp.get("NAME"));
			result.put("value", temp.get("VALUE"));
			resultList.add(result);
		}
		return resultList;
	}
	
	/**
	 * 获取规模分布数据
	 * @param entcat
	 * @return
	 */
	public List<Map<String, Object>> getGmfbData(String entcat) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		Map<String,String> filter = new HashMap<String,String>();
		if(!SysUtils.isNull(entcat)) {
			filter.put("entcat", entcat);
		}
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectGmfbData(filter);
		for(Map<String,Object> temp:list) {
			Map<String,Object> result = new HashMap<String,Object>();
			result.put("name", temp.get("NAME"));
			result.put("value", temp.get("NUM"));
			resultList.add(result);
		}
		Collections.reverse(resultList);
		return resultList;
	}
	
	/**
	 * 获取主体增长趋势数据
	 * @param entcat
	 * @return
	 */
	public Map<String, Object> getZtzzqsData(String entcat) {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String,String> filter = new HashMap<String,String>();
		if(!SysUtils.isNull(entcat)) {
			filter.put("entcat", entcat);
		}
		Map<String,Object> map = ztdjJbxxZsMapper.selectZtzzqsData(filter);
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		//当前日期
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, -10);
		for(int i=10;i>=0;i--) {
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH)+1;
			x_value.add(year+"-"+month);
			y_value.add((BigDecimal) map.get("MONTH"+i));
			calendar.add(Calendar.MONTH, +1);
		}
		return result;
	}
}
