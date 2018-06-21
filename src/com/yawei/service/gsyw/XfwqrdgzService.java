package com.yawei.service.gsyw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yawei.client.gsyw.Ai12315DjxxMapper;
/**
 * 消费维权热点关注处理
 * @author Administrator
 *
 */
@Service
public class XfwqrdgzService {
	
	@Autowired
	private Ai12315DjxxMapper ai12315DjxxMapper;
	
	/**
	 * 获取消费维权总览数据
	 * @return
	 */
	public Map<String, Object> getXfwqzlData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String,String> filterMap = new HashMap<String,String>();
		filterMap.put("type", "bq");
		List<Map<String,Object>> bqlist = ai12315DjxxMapper.selectXfwqzlData(filterMap);
		filterMap.put("type", "tq");
		List<Map<String,Object>> tqlist = ai12315DjxxMapper.selectXfwqzlData(filterMap);
		//统计本期总量、诉转案总量
		BigDecimal bqzs = new BigDecimal("0");
		result.put("bqzs", bqzs);
		BigDecimal bqszazs = new BigDecimal("0");
		result.put("bqszazs", bqszazs);
		BigDecimal bqts = new BigDecimal("0");
		result.put("bqts", bqts);
		BigDecimal bqjb = new BigDecimal("0");
		result.put("bqjb", bqjb);
		BigDecimal bqzx = new BigDecimal("0");
		result.put("bqzx", bqzx);
		BigDecimal bqtssza = new BigDecimal("0");
		result.put("bqtssza", bqtssza);
		BigDecimal bqjbsza = new BigDecimal("0");
		result.put("bqjbsza", bqjbsza);
		BigDecimal bqzxsza = new BigDecimal("0");
		result.put("bqzxsza", bqzxsza);
		//统计同期总量、诉转案总量
		BigDecimal tqzs = new BigDecimal("0");
		result.put("tqzs", tqzs);
		BigDecimal tqszazs = new BigDecimal("0");
		result.put("tqszazs", tqszazs);
		BigDecimal tqts = new BigDecimal("0");
		result.put("tqts", tqts);
		BigDecimal tqjb = new BigDecimal("0");
		result.put("tqjb", tqjb);
		BigDecimal tqzx = new BigDecimal("0");
		result.put("tqzx", tqzx);
		BigDecimal tqtssza = new BigDecimal("0");
		result.put("tqtssza", tqtssza);
		BigDecimal tqjbsza = new BigDecimal("0");
		result.put("tqjbsza", tqjbsza);
		BigDecimal tqzxsza = new BigDecimal("0");
		result.put("tqzxsza", tqzxsza);
		//同比
		BigDecimal zstb = new BigDecimal("0");
		result.put("zstb", zstb);
		BigDecimal zxtb = new BigDecimal("0");
		result.put("zxtb", zxtb);
		BigDecimal tstb = new BigDecimal("0");
		result.put("tstb", tstb);
		BigDecimal jbtb = new BigDecimal("0");
		result.put("jbtb", jbtb);
		for(Map<String,Object> temp:bqlist) {
			if("1".equals(temp.get("NAME"))) {
				bqts = (BigDecimal) temp.get("COUNT");
				bqtssza = (BigDecimal) temp.get("SZA");
				bqzs = bqzs.add(bqts);
				bqszazs = bqszazs.add(bqtssza);
			}else if("2".equals(temp.get("NAME"))) {
				bqjb = (BigDecimal) temp.get("COUNT");
				bqjbsza = (BigDecimal) temp.get("SZA");
				bqzs = bqzs.add(bqjb);
				bqszazs = bqszazs.add(bqjbsza);
			}else if("3".equals(temp.get("NAME"))) {
				bqzx = (BigDecimal) temp.get("COUNT");
				bqzxsza = (BigDecimal) temp.get("SZA");
				bqzs = bqzs.add(bqzx);
				bqszazs = bqszazs.add(bqzxsza);
			}
		}
		for(Map<String,Object> temp:tqlist) {
			if("1".equals(temp.get("NAME"))) {
				tqts = (BigDecimal) temp.get("COUNT");
				tqtssza = (BigDecimal) temp.get("SZA");
				tqzs = tqzs.add(tqts);
				tqszazs = tqszazs.add(tqtssza);
			}else if("2".equals(temp.get("NAME"))) {
				tqjb = (BigDecimal) temp.get("COUNT");
				tqjbsza = (BigDecimal) temp.get("SZA");
				tqzs = tqzs.add(tqjb);
				tqszazs = tqszazs.add(tqjbsza);
			}else if("3".equals(temp.get("NAME"))) {
				tqzx = (BigDecimal) temp.get("COUNT");
				tqzxsza = (BigDecimal) temp.get("SZA");
				tqzs = tqzs.add(tqzx);
				tqszazs = tqszazs.add(tqzxsza);
			}
		}
		if(tqzs.compareTo(BigDecimal.ZERO)>0) {
			zstb = bqzs.subtract(tqzs).divide(tqzs,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP);
		}
		if(tqts.compareTo(BigDecimal.ZERO)>0) {
			tstb = bqts.subtract(tqts).divide(tqts,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP);
		}
		if(tqjb.compareTo(BigDecimal.ZERO)>0) {
			jbtb = bqjb.subtract(tqjb).divide(tqjb,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP);
		}
		if(tqzx.compareTo(BigDecimal.ZERO)>0) {
			zxtb = bqzx.subtract(tqzx).divide(tqzx,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP);
		}
		//统计本期总量、诉转案总量
		result.put("bqzs", bqzs);
		result.put("bqszazs", bqszazs);
		result.put("bqts", bqts);
		result.put("bqjb", bqjb);
		result.put("bqzx", bqzx);
		result.put("bqtssza", bqtssza);
		result.put("bqjbsza", bqjbsza);
		result.put("bqzxsza", bqzxsza);
		//统计同期总量、诉转案总量
		result.put("tqzs", tqzs);
		result.put("tqszazs", tqszazs);
		result.put("tqts", tqts);
		result.put("tqjb", tqjb);
		result.put("tqzx", tqzx);
		result.put("tqtssza", tqtssza);
		result.put("tqjbsza", tqjbsza);
		result.put("tqzxsza", tqzxsza);
		//同比
		result.put("zstb", zstb);
		result.put("zxtb", zxtb);
		result.put("tstb", tstb);
		result.put("jbtb", jbtb);
		return result;
	}

	/**
	 * 获取投诉问题分析数据
	 * @param type 
	 * @return
	 */
	public Map<String, Object> getTswtfxData(String type) {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String,String> filterMap = new HashMap<String,String>();
		filterMap.put("type", type);
		int zj = ai12315DjxxMapper.selectTswtfxDlData(filterMap);
		List<Map<String,Object>> xlList = ai12315DjxxMapper.selectTswtfxXlData(filterMap);
		result.put("zj", zj);
		if(xlList.size()>5) {
			result.put("list", xlList.subList(0, 5));
		}else {
			for(int i=0;i<5-xlList.size();i++) {
				Map<String,Object> temp = new HashMap<String,Object>();
				temp.put("name", "-");
				temp.put("value", "-");
				xlList.add(temp);
			}
			result.put("list", xlList);
		}
		return result;
	}
	
	/**
	 * 获取各区投诉举报分析数据
	 * @return
	 */
	public Map<String, Object> getGqtsjbfxData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		Map<String,String> filterMap = new HashMap<String,String>();
		filterMap.put("infotype", "ts");
		List<Map<String,Object>> ts_data = ai12315DjxxMapper.selectGqtsjbfxData(filterMap);
		filterMap.put("infotype", "jb");
		List<Map<String,Object>> jb_data = ai12315DjxxMapper.selectGqtsjbfxData(filterMap);
		result.put("ts_data", ts_data);
		result.put("jb_data", jb_data);
		return result;
	}
	
	/**
	 * 获取举报问题分析数据
	 * @return
	 */
	public Map<String, Object> getJbwtfxData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<String> x_data = new ArrayList<String>();
		List<BigDecimal> y_data = new ArrayList<BigDecimal>();
		List<Map<String,Object>> list = ai12315DjxxMapper.selectJbwtfxData();
		for(Map<String,Object> temp:list) {
			x_data.add((String) temp.get("name"));
			y_data.add((BigDecimal) temp.get("value"));
		}
		result.put("x_data", x_data);
		result.put("y_data", y_data);
		return result;
	}
	
	/**
	 * 获取举报问题总体分析数据
	 * @return
	 */
	public Map<String, Object> getJbwtfxZtData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = ai12315DjxxMapper.selectJbwtfxZtData();
		return result;
	}

}
