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
 * 市场主体走势分析处理
 * @author Administrator
 *
 */
@Service
public class ScztzsfxService {
	
	@Autowired
	private ZtdjJbxxZsMapper ztdjJbxxZsMapper;
	
	/**
	 * 获取市场主体走势分析数据
	 * @param type
	 * @param entcat
	 * @return
	 */
	public Map<String, Object> getScztzsfxData(String type, String entcat) {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<String> list1 = new ArrayList<String>();//存储x轴坐标值
		List<BigDecimal> list2 = new ArrayList<BigDecimal>();//存储结果值1
		Map<String,Object> dataMap = null;
		Map<String,String> filterMap = new HashMap<String,String>();
		filterMap.put("entcat", entcat);
		if("cl".equals(type)) {
			dataMap = ztdjJbxxZsMapper.selectScztzsfxSlData(filterMap);
		} else {
			dataMap = ztdjJbxxZsMapper.selectScztzsfxZjData(filterMap);
		}
		Date date = new Date();//获取当前时间
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, -4);//开始统计时间
		for(int i=0;i<5;i++) {
			//获取年份
			int year = calendar.get(Calendar.YEAR);
			list1.add(year+"");
			//获取今年数量
			BigDecimal value0 = (BigDecimal) dataMap.get("VALUE"+i);
			list2.add(value0.setScale(0,BigDecimal.ROUND_HALF_UP));
			calendar.add(Calendar.YEAR, +1);
		}
		result.put("list1", list1);
		result.put("list2", list2);
		return result;
	}
	
	
}
