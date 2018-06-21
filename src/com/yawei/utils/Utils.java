package com.yawei.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Utils {
	
	/**
     * 使用 Map按key进行排序
     * @param map
     * @return
     */
    public static Map<String, List> sortMapByKey(Map<String, List> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<String, List> sortMap = new TreeMap<String, List>(
                new Comparator<String>(){
                    @Override
                    public int compare(String str1, String str2) {
                        return str1.compareTo(str2);
                    }
                });
        sortMap.putAll(map);
        return sortMap;
    }
    
    /**
	 * 使用 Map按value进行排序
	 * @param map
	 * @return
	 */
	public static Map<String, BigDecimal> sortMapByValue(Map<String, BigDecimal> oriMap) {
		if (oriMap == null || oriMap.isEmpty()) {
			return null;
		}
		Map<String, BigDecimal> sortedMap = new LinkedHashMap<String, BigDecimal>();
		List<Map.Entry<String, BigDecimal>> entryList = new ArrayList<Map.Entry<String, BigDecimal>>(
				oriMap.entrySet());
		Collections.sort(entryList, new Comparator<Map.Entry<String, BigDecimal>> (){

			@Override
			public int compare(Entry<String, BigDecimal> me1, Entry<String, BigDecimal> me2) {

				return me2.getValue().compareTo(me1.getValue());
			}
		});

		Iterator<Map.Entry<String, BigDecimal>> iter = entryList.iterator();
		Map.Entry<String, BigDecimal> tmpEntry = null;
		while (iter.hasNext()) {
			tmpEntry = iter.next();
			sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
		}
		return sortedMap;
	}


}
