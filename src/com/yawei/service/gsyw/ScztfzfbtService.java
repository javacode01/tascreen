package com.yawei.service.gsyw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yawei.client.gsyw.ZtdjJbxxZsMapper;

/**
 * 市场主体发展分布图处理
 * @author Administrator
 *
 */
@Service
public class ScztfzfbtService {
	
	@Autowired
	private ZtdjJbxxZsMapper ztdjJbxxZsMapper;
	
	/**
	 * 获取工商所主体数量
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public List<Map<String, Object>> getGssztslData(String startTime, String endTime) {
		// TODO Auto-generated method stub
		Map<String,String> filterMap = new HashMap<String,String>();
		filterMap.put("startTime", startTime);
		filterMap.put("endTime", endTime);
		List<Map<String,Object>> list = ztdjJbxxZsMapper.selectGssztslData(filterMap);
		return list;
	}
	
}
