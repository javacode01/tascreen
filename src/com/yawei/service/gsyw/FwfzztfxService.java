package com.yawei.service.gsyw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yawei.client.gsyw.SerdevSbxxMapper;
import com.yawei.client.gsyw.SerdevSzqyMapper;

/**
 * 服务发展专题分析处理
 * @author Administrator
 *
 */
@Service
public class FwfzztfxService {
	
	@Autowired
	private SerdevSzqyMapper serdevSzqyMapper;
	@Autowired
	private SerdevSbxxMapper serdevSbxxMapper;
	
	/**
	 * 获取各区县注册商标数据
	 * @return
	 */
	public Map<String, Object> getGqxzcsbData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = serdevSbxxMapper.selectGqxzcsbData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		for(Map<String,Object> temp:list) {
			x_value.add((String) temp.get("name"));
			y_value.add((BigDecimal) temp.get("value"));
		}
		result.put("mapData", list);
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		return result;
	}
	
	/**
	 * 获取守重企业数据分析数据
	 * @return
	 */
	public Map<String, Object> getSzqysjfxData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = serdevSzqyMapper.selectSzqysjfxData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		for(Map<String,Object> temp:list) {
			x_value.add((String) temp.get("NAME"));
			y_value.add((BigDecimal) temp.get("VALUE"));
		}
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		return result;
	}
	
	/**
	 * 获取注册商标趋势分析数据
	 * @return
	 */
	public Map<String, Object> getZcsbqsfxData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = serdevSbxxMapper.selectZcsbqsfxData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		int i= 0;
		for(Map<String,Object> temp:list) {
			if(i>=10) {
				break;
			}
			x_value.add((String) temp.get("NAME"));
			y_value.add((BigDecimal) temp.get("VALUE"));
			i++;
		}
		Collections.reverse(x_value);
		Collections.reverse(y_value);
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		return result;
	}
	
	/**
	 * 获取助企融资-股权出质数据
	 * @return
	 */
	public Map<String, Object> getZqrzGqczData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		Map<String,Object> map = serdevSbxxMapper.selectZqrzGqczData();
		x_value.add("业务办理量(件)");
		x_value.add("担保债权数额(亿元)");
		x_value.add("出质数额(亿元/亿股)");
		y_value.add((BigDecimal) map.get("BLL"));
		y_value.add(((BigDecimal) map.get("DBZQSE")).divide(new BigDecimal("10000"),0,BigDecimal.ROUND_HALF_UP));
		y_value.add(((BigDecimal) map.get("CZJE")).divide(new BigDecimal("10000"),0,BigDecimal.ROUND_HALF_UP));
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		return result;
	}
	
	/**
	 * 获取助企融资-动产抵押数据
	 * @return
	 */
	public Map<String, Object> getZqrzDcdyData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		Map<String,Object> map = serdevSbxxMapper.selectZqrzDcdyData();
		x_value.add("业务办理量(件)");
		x_value.add("抵押物数量(件)");
		x_value.add("抵押金额(亿元)");
		y_value.add((BigDecimal) map.get("BLL"));
		y_value.add((BigDecimal) map.get("DYWSL"));
		y_value.add(((BigDecimal) map.get("DYJE")).divide(new BigDecimal("10000"),0,BigDecimal.ROUND_HALF_UP));
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		return result;
	}
	
	/**
	 * 获取助企融资-商标权质押数据
	 * @return
	 */
	public Map<String, Object> getZqrzSbqzyData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		Map<String,Object> map = serdevSbxxMapper.selectZqrzSbqzyData();
		x_value.add("业务办理量(件)");
		x_value.add("质押金额(亿元)");
		y_value.add((BigDecimal) map.get("BLL"));
		y_value.add(((BigDecimal) map.get("ZYJE")).divide(new BigDecimal("10000"),0,BigDecimal.ROUND_HALF_UP));
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		return result;
	}
	
}
