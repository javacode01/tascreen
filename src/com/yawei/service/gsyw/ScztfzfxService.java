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

import com.yawei.client.gsyw.ZtdjJbxxZsMapper;

/**
 * 市场主体发展分析处理
 * @author Administrator
 *
 */
@Service
public class ScztfzfxService {
	
	@Autowired
	private ZtdjJbxxZsMapper ztdjJbxxZsMapper;
	
	/**
	 * 获取期末主体发展趋势数据
	 * @param type 
	 * @return
	 */
	public Map<String, Object> getQmztfzqsData(String type) {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<String> list1 = new ArrayList<String>();//存储x轴坐标值
		List<BigDecimal> list2 = new ArrayList<BigDecimal>();//存储结果值1
		List<BigDecimal> list3 = new ArrayList<BigDecimal>();//存储结果值2
		Map<String,Object> dataMap = null;
		if("type1".equals(type)) {
			dataMap = ztdjJbxxZsMapper.selectQmztfzqsSlData();
		}else {
			dataMap = ztdjJbxxZsMapper.selectQmztfzqsZjData();
		}
		Date date = new Date();//获取当前时间
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, -9);//开始统计时间
		for(int i=1;i<11;i++) {
			//获取年份
			int year = calendar.get(Calendar.YEAR);
			list1.add(year+"");
			//获取今年数量
			BigDecimal value0 = (BigDecimal) dataMap.get("VALUE"+i);
			//获取去年数量
			BigDecimal value1 = (BigDecimal) dataMap.get("VALUE"+(i-1));
			if("type2".equals(type)) {
				list2.add(value0.divide(new BigDecimal("10000"),0,BigDecimal.ROUND_HALF_UP));
			}else {
				list2.add(value0.setScale(0,BigDecimal.ROUND_HALF_UP));
			}
			//计算同比
			list3.add(value0.subtract(value1).divide(value1,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
			calendar.add(Calendar.YEAR, +1);
		}
		result.put("list1", list1);
		result.put("list2", list2);
		result.put("list3", list3);
		return result;
	}
	
	/**
	 * 获取主体同比增长排行榜数据
	 * @param entcat
	 * @return
	 */
	public Map<String, Object> getZttbzzData(String entcat) {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String,String> filterMap = new HashMap<String,String>();
		filterMap.put("entcat", entcat);
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectZttbzzData(filterMap);
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		x_value.add((String) list.get(1).get("NAME"));
		y_value.add((BigDecimal) list.get(1).get("VALUE"));
		x_value.add((String) list.get(0).get("NAME"));
		y_value.add((BigDecimal) list.get(0).get("VALUE"));
		x_value.add((String) list.get(2).get("NAME"));
		y_value.add((BigDecimal) list.get(2).get("VALUE"));
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		return result;
	}
	
	/**
	 * 获取主体类别发展分析
	 * @param entcat
	 * @return
	 */
	public Map<String, Object> getZtlbfzfxData(String entcat) {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String,String> filterMap = new HashMap<String,String>();
		filterMap.put("entcat", entcat);
		Map<String,Object> data1 = ztdjJbxxZsMapper.selectZtlbfzfxData(filterMap);
		Map<String,Object> data2 = ztdjJbxxZsMapper.selectZtlbfzfxTbData(filterMap);
		BigDecimal value1 = (BigDecimal) data1.get("VALUE");
		BigDecimal value2 = (BigDecimal) data2.get("VALUE");
		result.put("value",value1);
		result.put("tb", value1.subtract(value2).divide(value2,2,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(0,BigDecimal.ROUND_HALF_UP));
		return result;
	}
	
	/**
	 * 获取行业同比增长量数据
	 * @return
	 */
	public List<Map<String, Object>> getHytbzzlData() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> list1 = ztdjJbxxZsMapper.selectHytbzzlData();
		List<Map<String,Object>> list2 = ztdjJbxxZsMapper.selectHytbzzlTbData();
		//计算同比
		for(Map<String,Object> temp1:list1) {
			String name1 = (String) temp1.get("NAME");
			temp1.put("name", name1);
			BigDecimal value1 = (BigDecimal) temp1.get("VALUE");
			temp1.put("value", value1);
			temp1.put("tb", new BigDecimal("0"));
			if(value1.compareTo(BigDecimal.ZERO)==0) {
				break;
			}
			for(Map<String,Object> temp2:list2) {
				String name2 = (String) temp2.get("NAME");
				if(name1.equals(name2)) {
					BigDecimal value2 = (BigDecimal) temp2.get("VALUE");
					if(value2.compareTo(BigDecimal.ZERO)==0) {
						break;
					}
					temp1.put("tb", value1.subtract(value2).divide(value2,2,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
					break;
				}
			}
		}
		//排序
		for(int i=0;i<list1.size();i++) {
			for(int j=1;j<list1.size()-i;j++) {
				Map<String,Object> temp1 = list1.get(j-1);
				Map<String,Object> temp2 = list1.get(j);
				if(((BigDecimal)temp1.get("tb")).compareTo((BigDecimal)temp2.get("tb"))<0) {
					String name = (String) temp1.get("name");
					BigDecimal value = (BigDecimal) temp1.get("value");
					BigDecimal tb = (BigDecimal) temp1.get("tb");
					temp1.put("name", temp2.get("name"));
					temp1.put("value", temp2.get("value"));
					temp1.put("tb", temp2.get("tb"));
					temp2.put("name", name);
					temp2.put("value", value);
					temp2.put("tb", tb);
				}
			}
			
		}
		for(int i=0;i<list1.size()&&i<5;i++) {
			result.add(list1.get(i));
		}
		return result;
	}

}
