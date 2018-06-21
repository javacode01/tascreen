package com.yawei.service.gsyw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yawei.client.gsyw.NbZtJbxxMapper;
import com.yawei.client.gsyw.PubOrganMapper;
import com.yawei.model.gsyw.PubOrgan;
import com.yawei.model.gsyw.PubOrganExample;
import com.yawei.utils.Utils;

@Service
public class ScztnbzjService {
	
	@Autowired
	private NbZtJbxxMapper nbZtJbxxMapper;
	@Autowired
	private PubOrganMapper pubOrganMapper;
	
	/**
	 * 获取各辖区年报情况数据
	 * @return
	 */
	public Map<String, Object> getGxqnbqkData() {
		// TODO Auto-generated method stub
		//存储查询结果
		Map<String,Object> result=new HashMap<String,Object>();
		List<String> list1 = new ArrayList<String>();
		List<BigDecimal> list2 = new ArrayList<BigDecimal>();
		List<BigDecimal> list3 = new ArrayList<BigDecimal>();
		List<BigDecimal> list4 = new ArrayList<BigDecimal>();
		result.put("list1", list1);
		result.put("list2", list2);
		result.put("list3", list3);
		result.put("list4", list4);
		List<Map<String,Object>> resList= nbZtJbxxMapper.selectGxqnbqkData();
		//查询结果处理
		List<Map> tempList = new ArrayList<Map>();
		for(Map map:resList){
			if(null!=map.get("ORG")&&!"".equals(map.get("ORG"))){
				String ifpub = (String) map.get("IFPUB");
				Map<String,Object> newMap = new HashMap<String,Object>();
				newMap.put("regorg", map.get("ORG"));
				if("0".equals(ifpub)||"1".equals(ifpub)){
					newMap.put("ifpub", "未年报");
				}else if("2".equals(ifpub)||"3".equals(ifpub)||"5".equals(ifpub)){
					newMap.put("ifpub", "已年报");
				}
				newMap.put("value", map.get("NUM"));
				boolean f = false;
				for(Map temp:tempList){
					if(null!=temp&&null!=newMap&&temp.containsKey("regorg")&&temp.containsKey("ifpub")
							&&temp.get("regorg").equals(newMap.get("regorg"))&&temp.get("ifpub").equals(newMap.get("ifpub"))){
						temp.put("value", ((BigDecimal)temp.get("value")).add((BigDecimal)newMap.get("value")));
						f = true;
						break;
					}
				}
				if(!f){
					tempList.add(newMap);
				}
			}
		}
		Map<String,List> tempMap = new HashMap<String,List>();
		for(Map temp:tempList){
			String regorg = (String) temp.get("regorg");
			if(tempMap.containsKey(regorg)){
				List<BigDecimal> list = tempMap.get(regorg);
				if("已年报".equals(temp.get("ifpub"))){
					list.set(0,(BigDecimal)temp.get("value"));
				}else{
					list.set(1,(BigDecimal)temp.get("value"));
				}
			}else{
				List<BigDecimal> list = new ArrayList<BigDecimal>();
				for(int i=0;i<2;i++){
					list.add(new BigDecimal("0"));
				}
				if("已年报".equals(temp.get("ifpub"))){
					list.set(0,(BigDecimal)temp.get("value"));
				}else{
					list.set(1,(BigDecimal)temp.get("value"));
				}
				tempMap.put(regorg, list);
			}
		}
		if(!tempMap.isEmpty()){
			List<PubOrgan> organList = null;
			PubOrganExample poe = new PubOrganExample();
			List<String> typeList = new ArrayList<String>();
			typeList.add("3");
			typeList.add("4");
			poe.createCriteria().andOrganTypeIn(typeList);
			poe.setOrderByClause("seq asc");
			organList = pubOrganMapper.selectByExample(poe);
			tempMap = Utils.sortMapByKey(tempMap);
			for(PubOrgan pubOrgan:organList){
				if(!"3709".equals(pubOrgan.getOrganCode())){
					String tempCode = pubOrgan.getOrganCode();
					List<BigDecimal> list = tempMap.get(tempCode);
					if(null!=list&&list.size()>0){
						list1.add(pubOrgan.getOrganName());
						list2.add(list.get(0));
						list3.add(list.get(0).add(list.get(1)));
						if(list.get(0).add(list.get(1)).compareTo(new BigDecimal("0"))==1){
							list4.add(list.get(0).multiply(new BigDecimal(100)).divide(list.get(0).add(list.get(1)),2,BigDecimal.ROUND_HALF_UP));
						}else{
							list4.add(new BigDecimal("0"));
						}
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * 获取年度全市年报情况数据
	 * @return
	 */
	public Map<String, Object> getNdqsnbqkData() {
		// TODO Auto-generated method stub
		Map<String,Object> resMap= nbZtJbxxMapper.selectNdqsnbqkData();
		return resMap;
	}
	
	/**
	 * 获取年度纳税额数据
	 * @return
	 */
	public Map<String, Object> getNdnseData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = nbZtJbxxMapper.selectNdnseData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		for(int i=0;i<5&&i<list.size();i++) {
			Map<String,Object> temp = list.get(i);
			x_value.add((String) temp.get("NAME"));
			y_value.add(((BigDecimal) temp.get("VALUE")).setScale(2,BigDecimal.ROUND_HALF_UP));
		}
		return result;
	}
	
	/**
	 * 获取年度利润额数据
	 * @return
	 */
	public Map<String, Object> getNdlreData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		List<Map<String,Object>> list = nbZtJbxxMapper.selectNdlreData();
		List<String> x_value = new ArrayList<String>();
		List<BigDecimal> y_value = new ArrayList<BigDecimal>();
		result.put("x_value", x_value);
		result.put("y_value", y_value);
		for(int i=0;i<5&&i<list.size();i++) {
			Map<String,Object> temp = list.get(i);
			x_value.add((String) temp.get("NAME"));
			y_value.add(((BigDecimal) temp.get("VALUE")).setScale(2,BigDecimal.ROUND_HALF_UP));
		}
		return result;
	}
	
	/**
	 * 获取党组织建设情况数据
	 * @return
	 */
	public Map<String, Object> getDzzjsqkData() {
		// TODO Auto-generated method stub
		Map<String,Object> result = new HashMap<String,Object>();
		//企业党建情况
		Map<String,Object> qy = nbZtJbxxMapper.selectDzzjsqkQyData();
		Map<String,Object> qytq = nbZtJbxxMapper.selectDzzjsqkQyTqData();
		//个体党建情况
		Map<String,Object> gt = nbZtJbxxMapper.selectDzzjsqkGtData();
		Map<String,Object> gttq = nbZtJbxxMapper.selectDzzjsqkQyTqData();
		//存储结果
		Map<String,Object> qydj = new HashMap<String,Object>();
		Map<String,Object> gtdj = new HashMap<String,Object>();
		//企业
		BigDecimal qydw = (BigDecimal) qy.get("DW");
		BigDecimal qydzz = (BigDecimal) qy.get("DZZ");
		BigDecimal qydzb = (BigDecimal) qy.get("DZB");
		BigDecimal qyhj = qydw.add(qydzz).add(qydzb);
		BigDecimal qytqhj = ((BigDecimal) qytq.get("DW")).add((BigDecimal) qytq.get("DZZ")).add((BigDecimal) qytq.get("DZB"));
		qydj.put("entcat", "私营");
		qydj.put("dw", qydw);
		qydj.put("dzz", qydzz);
		qydj.put("dzb", qydzb);
		qydj.put("hj", qyhj);
		qydj.put("tb", qyhj.subtract(qytqhj).divide(qytqhj,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
		qydj.put("dzzfgl", qyhj.divide(qyhj.add((BigDecimal) qy.get("WCL")),4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
		qydj.put("dyrs", qy.get("DYRS"));
		//个体
		BigDecimal gtdw = (BigDecimal) gt.get("DW");
		BigDecimal gtdzz = (BigDecimal) gt.get("DZZ");
		BigDecimal gtdzb = (BigDecimal) gt.get("DZB");
		BigDecimal gthj = gtdw.add(gtdzz).add(gtdzb);
		BigDecimal gttqhj = ((BigDecimal) gttq.get("DW")).add((BigDecimal) gttq.get("DZZ")).add((BigDecimal) gttq.get("DZB"));
		gtdj.put("entcat", "个体");
		gtdj.put("dw", gtdw);
		gtdj.put("dzz", gtdzz);
		gtdj.put("dzb", gtdzb);
		gtdj.put("hj", gthj);
		gtdj.put("tb", gthj.subtract(gttqhj).divide(gttqhj,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
		gtdj.put("dzzfgl", gthj.divide(gthj.add((BigDecimal) gt.get("WCL")),4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP));
		gtdj.put("dyrs", gt.get("DYRS"));
		result.put("qydj", qydj);
		result.put("gtdj", gtdj);
		return result;
	}
}
