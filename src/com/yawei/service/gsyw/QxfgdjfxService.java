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

import com.yawei.client.gsyw.NbZtJbxxMapper;

/**
 * 区县非公党建分析处理
 * @author Administrator
 *
 */
@Service
public class QxfgdjfxService {
	
	@Autowired
	private NbZtJbxxMapper nbZtJbxxMapper;
	
	/**
	 * 获取全市党组织建设总览数据
	 * @return
	 */
	public Map<String, Object> getQsdzzjszlData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		//企业党建情况
		Map<String,Object> qy = nbZtJbxxMapper.selectDzzjsqkQyData();
		//个体党建情况
		Map<String,Object> gt = nbZtJbxxMapper.selectDzzjsqkGtData();
		result.put("qy", qy);
		result.put("gt", gt);
		return result;
	}
	
	/**
	 * 获取各区县党组织建设总览数据
	 * @return
	 */
	public Map<String, Object> getGqxdzzjszlData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		//各区县党建情况
		List<Map<String,Object>> resultList = nbZtJbxxMapper.selectGqxDjqkData();
		List<String> list = new ArrayList<String>();
		List<BigDecimal> list1 = new ArrayList<BigDecimal>();
		List<BigDecimal> list2 = new ArrayList<BigDecimal>();
		List<BigDecimal> list3 = new ArrayList<BigDecimal>();
		for(Map<String,Object> temp:resultList) {
			list.add((String) temp.get("NAME"));
			list1.add((BigDecimal) temp.get("DW"));
			list2.add((BigDecimal) temp.get("DZZ"));
			list3.add((BigDecimal) temp.get("DZB"));
		}
		result.put("list", list);
		result.put("list1", list1);
		result.put("list2", list2);
		result.put("list3", list3);
		return result;
	}
	
	/**
	 * 获取各区县党组织排行榜数据
	 * @return
	 */
	public List<Map<String, Object>> getQxdzzphbData() {
		// TODO Auto-generated method stub
		return nbZtJbxxMapper.selectQxdzzphbData();
	}
	
	/**
	 * 获取各区县党员人数排行榜数据
	 * @return
	 */
	public List<Map<String, Object>> getQxdyrsphbData() {
		// TODO Auto-generated method stub
		return nbZtJbxxMapper.selectQxdyrsphbData();
	}
	
	/**
	 * 获取党组织增长趋势数据
	 * @return
	 */
	public Map<String, Object> getDzzzzqsData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String,Object> map = nbZtJbxxMapper.selectDzzzzqsData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		//当前日期
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, -3);
		for(int i=1;i<=3;i++) {
			int year = calendar.get(Calendar.YEAR);
			x_value.add(year+"");
			y_value.add((BigDecimal) map.get("YEAR"+i));
			calendar.add(Calendar.YEAR, +1);
		}
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		return result;
	}
	
	/**
	 * 获取党员人数增长趋势数据
	 * @return
	 */
	public Map<String, Object> getDyrszzqsData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String,Object> map = nbZtJbxxMapper.selectDyrszzqsData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		//当前日期
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, -3);
		for(int i=1;i<=3;i++) {
			int year = calendar.get(Calendar.YEAR);
			x_value.add(year+"");
			y_value.add((BigDecimal) map.get("YEAR"+i));
			calendar.add(Calendar.YEAR, +1);
		}
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		return result;
	}
	
}
