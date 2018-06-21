package com.yawei.service.gsyw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yawei.client.gsyw.Ai12315DjxxMapper;
import com.yawei.client.gsyw.NbZtJbxxMapper;
import com.yawei.client.gsyw.ZfglCfJbxxMapper;

@Service
public class GsywssService {
	
	@Autowired
	private NbZtJbxxMapper nbZtJbxxMapper;
	@Autowired
	private ZfglCfJbxxMapper zfglCfJbxxMapper;
	@Autowired
	private Ai12315DjxxMapper ai12315DjxxMapper;
	
	/**
	 * 获取年报监控数据
	 * @return
	 */
	public List<Map<String, Object>> getNbjkData() {
		// TODO Auto-generated method stub
		Map<String,Object> nbjkData = nbZtJbxxMapper.selectNbjkData();
		BigDecimal qyyb = (BigDecimal) nbjkData.get("QYYB");//企业已报
		BigDecimal qywb = (BigDecimal) nbjkData.get("QYWB");//企业未报
		BigDecimal gtyb = (BigDecimal) nbjkData.get("GTYB");//个体已报
		BigDecimal gtwb = (BigDecimal) nbjkData.get("GTWB");//个体未报
		BigDecimal nhyb = (BigDecimal) nbjkData.get("NHYB");//农合已报
		BigDecimal nhwb = (BigDecimal) nbjkData.get("NHWB");//农合未报
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		//企业已报、应报、年报率
		Map<String,Object> qyResult = new HashMap<String,Object>();
		qyResult.put("entname", "企业");
		qyResult.put("yb",qyyb);
		qyResult.put("zs", qyyb.add(qywb));
		String qynbl = qyyb.divide(qyyb.add(qywb),4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP).toString()+"%";
		qyResult.put("nbl", qynbl);
		resultList.add(qyResult);
		//农合已报、应报、年报率
		Map<String,Object> nhResult = new HashMap<String,Object>();
		nhResult.put("entname", "农专");
		nhResult.put("yb",nhyb);
		nhResult.put("zs", nhyb.add(nhwb));
		String nhnbl = nhyb.divide(nhyb.add(nhwb),4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP).toString()+"%";
		nhResult.put("nbl", nhnbl);
		resultList.add(nhResult);
		//个体已报、应报、年报率
		Map<String,Object> gtResult = new HashMap<String,Object>();
		gtResult.put("entname", "个体");
		gtResult.put("yb",gtyb);
		gtResult.put("zs", gtyb.add(gtwb));
		String gtnbl = gtyb.divide(gtyb.add(gtwb),4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP).toString()+"%";
		gtResult.put("nbl", gtnbl);
		resultList.add(gtResult);
		return resultList;
	}
	
	/**
	 * 获取执法办案情况数据
	 * @return
	 */
	public List<Object> getZfbaqkData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = zfglCfJbxxMapper.selectZfbaqkData();
		List<Object> list = new ArrayList<Object>();
		BigDecimal bndfk = (BigDecimal) result.get("BNDFK");
		list.add(bndfk.divide(new BigDecimal("10000"),2,BigDecimal.ROUND_HALF_UP));
		list.add(result.get("BNDJA"));
		list.add(result.get("BNDLA"));
		return list;
	}

	/**
	 * 获取消保维权数据
	 * @return
	 */
	public List<Map<String,Object>> getXbwqData() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> list = ai12315DjxxMapper.selectXbwqData();
		String[] resultType = {"3","1","2","9"};
		for(String type:resultType) {
			Map<String,Object> tempResult = new HashMap<String,Object>();
			if("1".equals(type)) {
				tempResult.put("infotypeName", "投诉");
			}else if("2".equals(type)) {
				tempResult.put("infotypeName", "举报");
			}else if("3".equals(type)) {
				tempResult.put("infotypeName", "咨询");
			}else if("9".equals(type)){
				tempResult.put("infotypeName", "其他");
			}
			boolean f = false;
			for(Map<String,Object> temp:list) {
				if(type.equals(temp.get("INFOTYPE"))) {
					tempResult.put("jrdj", temp.get("JRDJ"));
					tempResult.put("zrdj", temp.get("ZRDJ"));
					tempResult.put("jrbj", temp.get("JRBJ"));
					tempResult.put("zrbj", temp.get("ZRBJ"));
					f = true;
					break;
				}
			}
			if(!f) {
				tempResult.put("jrdj", BigDecimal.ZERO);
				tempResult.put("zrdj", BigDecimal.ZERO);
				tempResult.put("jrbj", BigDecimal.ZERO);
				tempResult.put("zrbj", BigDecimal.ZERO);
			}
			result.add(tempResult);
		}
		return result;
	}

}
