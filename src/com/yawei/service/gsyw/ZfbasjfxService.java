package com.yawei.service.gsyw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yawei.client.gsyw.ZfglCfJbxxMapper;

/**
 * 执法办案数据分析
 * @author Administrator
 *
 */
@Service
public class ZfbasjfxService {
	
	@Autowired
	private ZfglCfJbxxMapper zfglCfJbxxMapper;
	
	/**
	 * 获取案件类型分析数据
	 * @return
	 */
	public Map<String, Object> getAjlxfxData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = zfglCfJbxxMapper.selectAjlxfxData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		for(Map<String,Object> temp:list) {
			x_value.add((String) temp.get("ITEM_NAME"));
			y_value.add(((BigDecimal) temp.get("CASECOUNT")));
		}
		return result;
	}
	
	/**
	 * 获取案件趋势分析数据
	 * @return
	 */
	public Map<String, Object> getAjqsfxData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = zfglCfJbxxMapper.selectAjqsfxData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		for(Map<String,Object> temp:list) {
			x_value.add((String) temp.get("NAME"));
			y_value.add(((BigDecimal) temp.get("VALUE")));
		}
		return result;
	}
	
	/**
	 * 获取各区县执法数据分析数据
	 * @return
	 */
	public List<Map<String, Object>> getGqxzfsjfxData() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
		Map<String,String> filterMap = new HashMap<String,String>();
		filterMap.put("type", "bq");
		List<Map<String, Object>> bqlist = zfglCfJbxxMapper.selectGqxzfsjfxData(filterMap);
		filterMap.put("type", "tq");
		List<Map<String, Object>> tqlist = zfglCfJbxxMapper.selectGqxzfsjfxData(filterMap);
		int i=1;
		for(Map<String,Object> bqtemp:bqlist) {
			Map<String,Object> resultTemp = new HashMap<String,Object>();
			resultTemp.put("seq", i);
			resultTemp.put("qx", bqtemp.get("ORGAN_NAME"));
			resultTemp.put("jasl", bqtemp.get("COUNT"));
			resultTemp.put("zaz", bqtemp.get("CASEVAL"));
			resultTemp.put("pjaz", bqtemp.get("AVGCASEVAL"));
			resultTemp.put("fmje", bqtemp.get("PEAFM"));
			Iterator<Map<String,Object>> tqIt = tqlist.iterator();
			boolean f = false;
			while(tqIt.hasNext()) {
				Map<String,Object> tqtemp = tqIt.next();
				if(tqtemp.get("ORGAN_NAME").equals(bqtemp.get("ORGAN_NAME"))) {
					BigDecimal bqCount = (BigDecimal) bqtemp.get("COUNT");
					BigDecimal tqCount = (BigDecimal) tqtemp.get("COUNT");
					BigDecimal tbzl = bqCount.subtract(tqCount).divide(tqCount,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100"));
					resultTemp.put("tbzl", tbzl.setScale(2,BigDecimal.ROUND_HALF_UP));
					f = true;
					break;
				}
			}
			if(!f) {
				resultTemp.put("tbzl", (new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
			}
			i++;
			result.add(resultTemp);
		}
		return result;
	}
	
	/**
	 * 获取年度数据
	 * @return
	 */
	public List<Map<String, Object>> getNdData() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
		Map<String,Object> nd = zfglCfJbxxMapper.selectNdData();
		Map<String,Object> ndtq = zfglCfJbxxMapper.selectNdTqData();
		//立案数量
		Map<String,Object> laslData = new HashMap<String,Object>();
		BigDecimal lasl = (BigDecimal) nd.get("LASL");
		BigDecimal laslTq = (BigDecimal) ndtq.get("LASL");
		laslData.put("type", "立案数量");
		laslData.put("value", lasl);
		laslData.put("tb", lasl.subtract(laslTq).divide(laslTq,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
		result.add(laslData);
		//结案数量
		Map<String,Object> jaslData = new HashMap<String,Object>();
		BigDecimal jasl = (BigDecimal) nd.get("JASL");
		BigDecimal jaslTq = (BigDecimal) ndtq.get("JASL");
		jaslData.put("type", "结案数量");
		jaslData.put("value", jasl);
		if(jaslTq.compareTo(BigDecimal.ZERO)==0) {
			jaslData.put("tb", BigDecimal.ZERO);
		}else {
			jaslData.put("tb", jasl.subtract(jaslTq).divide(jaslTq,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
		}
		result.add(jaslData);
		//在办案件
		Map<String,Object> zbajData = new HashMap<String,Object>();
		BigDecimal zbaj = (BigDecimal) nd.get("ZBAJ");
		BigDecimal zbajTq = (BigDecimal) ndtq.get("ZBAJ");
		zbajData.put("type", "在办案件");
		zbajData.put("value", zbaj);
		if(zbajTq.compareTo(BigDecimal.ZERO)==0) {
			zbajData.put("tb", BigDecimal.ZERO);
		}else {
			zbajData.put("tb", zbaj.subtract(zbajTq).divide(zbajTq,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
		}
		result.add(zbajData);
		//大案要案
		Map<String,Object> dayaData = new HashMap<String,Object>();
		BigDecimal daya = (BigDecimal) nd.get("DAYA");
		BigDecimal dayaTq = (BigDecimal) ndtq.get("DAYA");
		dayaData.put("type", "大案要案");
		dayaData.put("value", daya);
		if(dayaTq.compareTo(BigDecimal.ZERO)==0) {
			dayaData.put("tb", BigDecimal.ZERO);
		}else {
			dayaData.put("tb", daya.subtract(dayaTq).divide(dayaTq,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
		}
		result.add(dayaData);
		//罚没金额
		Map<String,Object> fkjeData = new HashMap<String,Object>();
		BigDecimal fkje = (BigDecimal) nd.get("FKJE");
		BigDecimal fkjeTq = (BigDecimal) ndtq.get("FKJE");
		fkjeData.put("type", "罚没金额");
		fkjeData.put("value", fkje);
		if(fkjeTq.compareTo(BigDecimal.ZERO)==0) {
			fkjeData.put("tb", BigDecimal.ZERO);
		}else {
			fkjeData.put("tb", fkje.subtract(fkjeTq).divide(fkjeTq,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
		}
		result.add(fkjeData);
		return result;
	}

}
