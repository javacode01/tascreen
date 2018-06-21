package com.yawei.service.gsyw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yawei.client.gsyw.ZtdjJbxxZsMapper;

@Service
public class ScztryhlfxService {
	
	@Autowired
	private ZtdjJbxxZsMapper ztdjJbxxZsMapper;
	
	/**
	 * 获取企业家每百人性别分布数据
	 * @return
	 */
	public List<Map<String, Object>> getQyjmbrxbfbData() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectQyjmbrxbfbData();
		BigDecimal zs = new BigDecimal("0");
		for(Map<String,Object> temp:list) {
			BigDecimal value = (BigDecimal) temp.get("VALUE");
			zs = zs.add(value);
		}
		for(Map<String,Object> temp:list) {
			Map<String,Object> result = new HashMap<String,Object>();
			if("1".equals(temp.get("NAME"))) {
				result.put("name", "男");
			}else {
				result.put("name", "女");
			}
			if(zs.compareTo(BigDecimal.ZERO)>0) {
				BigDecimal value = (BigDecimal) temp.get("VALUE");
				BigDecimal bfb = value.divide(zs,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100"));
				result.put("value", bfb.setScale(0,BigDecimal.ROUND_HALF_UP));
			}else {
				result.put("value", BigDecimal.ZERO);
			}
			resultList.add(result);
		}
		return resultList;
	}
	
	/**
	 * 获取企业家每百人地区分布数据
	 * @return
	 */
	public Map<String, Object> getQyjmbrdqfbData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectQyjmbrdqfbData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		BigDecimal zs = new BigDecimal("0");
		for(Map<String,Object> temp:list) {
			x_value.add((String) temp.get("NAME"));
			zs = zs.add((BigDecimal) temp.get("VALUE"));
		}
		for(Map<String,Object> temp:list) {
			if(zs.compareTo(BigDecimal.ZERO)>0) {
				BigDecimal value = (BigDecimal) temp.get("VALUE");
				BigDecimal bfb = value.divide(zs,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100"));
				y_value.add(bfb.setScale(0,BigDecimal.ROUND_HALF_UP));
			}else {
				y_value.add(BigDecimal.ZERO);
			}
		}
		return result;
	}
	
	/**
	 * 获取企业家年龄分布数据
	 * @return
	 */
	public Map<String, Object> getQyjnlfbData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectQyjnlfbData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		for(Map<String,Object> temp:list) {
			x_value.add(((String) temp.get("NAME")).replace("A", "").replace("B", "").replace("C", "").replace("D", "").replace("E", ""));
			y_value.add((BigDecimal) temp.get("VALUE"));
		}
		return result;
	}
	
	/**
	 * 获取企业家学历分布数据
	 * @return
	 */
	public List<Map<String, Object>> getQyjxlfbData() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectQyjxlfbData();
		for(Map<String,Object> temp:list) {
			Map<String,Object> result = new HashMap<String,Object>();
			if(null==temp.get("name")||"".equals(temp.get("name"))) {
				result.put("name", "其他");
			}else {
				result.put("name", temp.get("name"));
			}
			result.put("value", temp.get("value"));
			resultList.add(result);
		}
		return resultList;
	}
	
	/**
	 * 获取每百人企业家性别年龄总览
	 * @return
	 */
	public Map<String, Object> getMbrqyjxbnlzlData() {
		// TODO Auto-generated method stub
		Map<String,Object> resultMap = new HashMap<String,Object>();
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectMbrqyjxbnlzlData();
		List<String> y_value = new ArrayList<String>();
		y_value.add("30岁以下");
		y_value.add("30-40岁");
		y_value.add("40-50岁");
		y_value.add("50-60岁");
		y_value.add("60岁以上");
		List<BigDecimal> m_value = new ArrayList<BigDecimal>();
		List<BigDecimal> f_value = new ArrayList<BigDecimal>();
		BigDecimal zs = new BigDecimal("0");
		for(Map<String,Object> temp:list) {
			zs = zs.add((BigDecimal) temp.get("VALUE"));
		}
		for(String yValue:y_value) {
			boolean m = false;
			boolean f = false;
			for(Map<String,Object> temp:list) {
				if(yValue.equals(temp.get("NAME"))) {
					if("1".equals(temp.get("NAME1"))) {
						if(zs.compareTo(BigDecimal.ZERO)>0) {
							BigDecimal value = (BigDecimal) temp.get("VALUE");
							BigDecimal bfb = value.divide(zs,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100"));
							m_value.add(bfb.setScale(0,BigDecimal.ROUND_HALF_UP));
						}else {
							m_value.add(BigDecimal.ZERO);
						}
						m = true;
					}
					if("2".equals(temp.get("NAME1"))) {
						if(zs.compareTo(BigDecimal.ZERO)>0) {
							BigDecimal value = (BigDecimal) temp.get("VALUE");
							BigDecimal bfb = value.divide(zs,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100"));
							f_value.add(bfb.setScale(0,BigDecimal.ROUND_HALF_UP));
						}else {
							f_value.add(BigDecimal.ZERO);
						}
						f = true;
					}
				}
			}
			if(!m) {
				m_value.add(BigDecimal.ZERO);
			}
			if(!f) {
				f_value.add(BigDecimal.ZERO);
			}
		}
		resultMap.put("y_value", y_value);
		resultMap.put("f_value", f_value);
		resultMap.put("m_value", m_value);
		return resultMap;
	}

}
