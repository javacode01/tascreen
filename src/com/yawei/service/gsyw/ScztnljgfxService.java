package com.yawei.service.gsyw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.utils.SysUtils;
import com.yawei.client.gsyw.ZtdjJbxxZsMapper;

@Service
public class ScztnljgfxService {
	
	@Autowired
	private ZtdjJbxxZsMapper ztdjJbxxZsMapper;

	public Map<String, Object> getQynlzbData(String entcat) {
		// TODO Auto-generated method stub
		Map<String,String> filter = new HashMap<String,String>();
		if(!SysUtils.isNull(entcat)) {
			filter.put("entcat", entcat);
		}
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectQynlzbData(filter);
		Map<String,Object> result = new HashMap<String,Object>();
		List<String> xData = new ArrayList<String>();
		xData.add("5年以下");
		xData.add("5-10年");
		xData.add("10-20年");
		xData.add("20年以上");
		List<Map<String,Object>> newList = new ArrayList<Map<String,Object>>();
		for(String type:xData) {
			boolean f = false;
			for(Map<String,Object> temp:list) {
				if(type.equals(temp.get("name"))) {
					newList.add(temp);
					f = true;
				}
			}
			if(!f) {
				Map<String,Object> newTemp = new HashMap<String,Object>();
				newTemp.put("name", type);
				newTemp.put("value", BigDecimal.ZERO);
				newList.add(newTemp);
			}
		}
		result.put("xdata", xData);
		result.put("data", newList);
		return result;
	}

	public List<Map<String, Object>> getCsqyhyfxData(String type) {
		// TODO Auto-generated method stub
		Map<String,String> filter = new HashMap<String,String>();
		if(!SysUtils.isNull(type)) {
			filter.put("type", type);
		}else {
			return null;
		}
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectCsqyhyfxData(filter);
		return list;
	}
	
	/**
	 * 获取长寿企业追踪分析数据
	 * @return
	 */
	public Map<String, Object> getCsqyzzfxData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		Date date = new Date();//获取当前时间
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		Map<String,String> filterMap = new HashMap<String,String>();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value1 = new ArrayList<BigDecimal>();
		List<BigDecimal> y_value2 = new ArrayList<BigDecimal>();
		List<BigDecimal> y_value3 = new ArrayList<BigDecimal>();
		List<BigDecimal> y_value4 = new ArrayList<BigDecimal>();
		Map<String,Map<String,Object>> data = csqyzzfxData();//存量数据
		calendar.add(Calendar.YEAR, -9);
		for(int i=9;i>=0;i--) {
			int year = calendar.get(Calendar.YEAR);
			filterMap.put("year", year+"");
			Map<String,Object> tempResult = null;
			if(data.containsKey(year+"")) {
				tempResult = data.get(year+"");
			}else {
				tempResult = ztdjJbxxZsMapper.selectCsqyzzfxData(filterMap);
			}
			x_value.add(year+"");
			y_value1.add((BigDecimal) tempResult.get("A"));
			y_value2.add((BigDecimal) tempResult.get("B"));
			y_value3.add((BigDecimal) tempResult.get("C"));
			y_value4.add((BigDecimal) tempResult.get("D"));
			calendar.add(Calendar.YEAR, +1);
		}
		result.put("x_value", x_value);
		result.put("y_value1", y_value1);
		result.put("y_value2", y_value2);
		result.put("y_value3", y_value3);
		result.put("y_value4", y_value4);
		return result;
	}
	
	/**
	 * 长寿企业追踪分析历史数据记录
	 * @return
	 */
	public Map<String,Map<String,Object>> csqyzzfxData(){
		Map<String,Map<String,Object>> result = new HashMap<String,Map<String,Object>>();
		Map<String,Object> data2009 = new HashMap<String,Object>();
		data2009.put("A", new BigDecimal("50365"));
		data2009.put("B", new BigDecimal("22830"));
		data2009.put("C", new BigDecimal("2430"));
		data2009.put("D", new BigDecimal("90"));
		result.put("2009", data2009);
		Map<String,Object> data2010 = new HashMap<String,Object>();
		data2010.put("A", new BigDecimal("61372"));
		data2010.put("B", new BigDecimal("28902"));
		data2010.put("C", new BigDecimal("5162"));
		data2010.put("D", new BigDecimal("689"));
		result.put("2010", data2010);
		Map<String,Object> data2011 = new HashMap<String,Object>();
		data2011.put("A", new BigDecimal("74203"));
		data2011.put("B", new BigDecimal("33149"));
		data2011.put("C", new BigDecimal("7715"));
		data2011.put("D", new BigDecimal("768"));
		result.put("2011", data2011);
		Map<String,Object> data2012 = new HashMap<String,Object>();
		data2012.put("A", new BigDecimal("84758"));
		data2012.put("B", new BigDecimal("36934"));
		data2012.put("C", new BigDecimal("10902"));
		data2012.put("D", new BigDecimal("858"));
		result.put("2012", data2012);
		Map<String,Object> data2013 = new HashMap<String,Object>();
		data2013.put("A", new BigDecimal("93097"));
		data2013.put("B", new BigDecimal("44781"));
		data2013.put("C", new BigDecimal("14713"));
		data2013.put("D", new BigDecimal("1043"));
		result.put("2013", data2013);
		Map<String,Object> data2014 = new HashMap<String,Object>();
		data2014.put("A", new BigDecimal("98473"));
		data2014.put("B", new BigDecimal("59690"));
		data2014.put("C", new BigDecimal("23860"));
		data2014.put("D", new BigDecimal("1180"));
		result.put("2014", data2014);
		Map<String,Object> data2015 = new HashMap<String,Object>();
		data2015.put("A", new BigDecimal("115250"));
		data2015.put("B", new BigDecimal("67951"));
		data2015.put("C", new BigDecimal("30225"));
		data2015.put("D", new BigDecimal("1374"));
		result.put("2015", data2015);
		Map<String,Object> data2016 = new HashMap<String,Object>();
		data2016.put("A", new BigDecimal("140512"));
		data2016.put("B", new BigDecimal("81273"));
		data2016.put("C", new BigDecimal("37064"));
		data2016.put("D", new BigDecimal("1513"));
		result.put("2016", data2016);
		Map<String,Object> data2017 = new HashMap<String,Object>();
		data2017.put("A", new BigDecimal("164805"));
		data2017.put("B", new BigDecimal("91665"));
		data2017.put("C", new BigDecimal("43859"));
		data2017.put("D", new BigDecimal("1777"));
		result.put("2017", data2017);
		return result;
	}
}
