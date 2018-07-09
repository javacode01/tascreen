package com.yawei.service.gsyw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yawei.client.gsyw.ZtdjJbxxZsMapper;

/**
 * 市场主体资金来源（境外）分析处理
 * @author Administrator
 *
 */
@Service
public class ScztzjlyjwfxService {
	
	@Autowired
	private ZtdjJbxxZsMapper ztdjJbxxZsMapper;
	
	/**
	 * 获取投资金额排行数据
	 * @return
	 */
	public Map<String, Object> getTzjephjwData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectTzjephjwData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		for(int i=0;i<list.size()&&i<9;i++) {
			Map<String,Object> temp = list.get(i);
			x_value.add((String) temp.get("NAME"));
			y_value.add(((BigDecimal) temp.get("VALUE")).setScale(0,BigDecimal.ROUND_HALF_UP));
		}
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		return result;
	}
	
	/**
	 * 获取投资金额排行表格数据
	 * @return
	 */
	public Map<String, Object> getTzjephTableData() {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> result1 = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> result2 = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectTzjephjwData();
		int i=1;
		for(Map<String,Object> temp:list) {
			Map<String,Object> tempResult = new HashMap<String,Object>();
			tempResult.put("name", (String) temp.get("NAME"));
			tempResult.put("value", ((BigDecimal) temp.get("VALUE")).setScale(0,BigDecimal.ROUND_HALF_UP));
			tempResult.put("seq",i+"");
			if(i<=10) {
				result1.add(tempResult);
			}else if(i>10&&i<=20) {
				result2.add(tempResult);
			}else {
				break;
			}
			i++;
		}
		result.put("result1", result1);
		result.put("result2", result2);
		return result;
	}
	
	/**
	 * 获取投资金额排行全部数据
	 * @return
	 */
	public List<Map<String, Object>> getTzjephAllData() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectTzjephjwData();
		int i=1;
		for(Map<String,Object> temp:list) {
			Map<String,Object> tempResult = new HashMap<String,Object>();
			tempResult.put("name", (String) temp.get("NAME"));
			tempResult.put("value", ((BigDecimal) temp.get("VALUE")).setScale(0,BigDecimal.ROUND_HALF_UP));
			result.add(tempResult);
		}
		return result;
	}
	
	/**
	 * 获取户数排行数据
	 * @return
	 */
	public Map<String, Object> getTzjephjwhsData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectTzjephjwhsData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		for(int i=0;i<list.size()&&i<9;i++) {
			Map<String,Object> temp = list.get(i);
			x_value.add((String) temp.get("NAME"));
			y_value.add(((BigDecimal) temp.get("VALUE")).setScale(0,BigDecimal.ROUND_HALF_UP));
		}
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		return result;
	}
	
	/**
	 * 获取投资户数
	 * @return
	 */
	public Map<String, Object> getTzjephhsTableData() {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> result1 = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> result2 = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectTzjephjwhsData();
		int i=1;
		for(Map<String,Object> temp:list) {
			Map<String,Object> tempResult = new HashMap<String,Object>();
			tempResult.put("name", (String) temp.get("NAME"));
			tempResult.put("value", ((BigDecimal) temp.get("VALUE")).setScale(0,BigDecimal.ROUND_HALF_UP));
			tempResult.put("seq",i+"");
			if(i<=10) {
				result1.add(tempResult);
			}else if(i>10&&i<=20) {
				result2.add(tempResult);
			}else {
				break;
			}
			i++;
		}
		result.put("result1", result1);
		result.put("result2", result2);
		return result;
	}

}
