package com.yawei.client.gsyw;

import com.yawei.model.gsyw.ZtdjJbxxZs;
import com.yawei.model.gsyw.ZtdjJbxxZsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ZtdjJbxxZsMapper {
    int countByExample(ZtdjJbxxZsExample example);

    int deleteByExample(ZtdjJbxxZsExample example);

    int insert(ZtdjJbxxZs record);

    int insertSelective(ZtdjJbxxZs record);

    List<ZtdjJbxxZs> selectByExample(ZtdjJbxxZsExample example);

    int updateByExampleSelective(@Param("record") ZtdjJbxxZs record, @Param("example") ZtdjJbxxZsExample example);

    int updateByExample(@Param("record") ZtdjJbxxZs record, @Param("example") ZtdjJbxxZsExample example);

	Map<String, Object> selectZtzlData(Map<String, String> filter);

	List<Map<String, Object>> selectCyfbData(Map<String, String> filter);

	List<Map<String, Object>> selectGqxztslData(Map<String, String> filter);

	List<Map<String, Object>> selectLxfbData();

	List<Map<String, Object>> selectGmfbData(Map<String, String> filter);

	Map<String, Object> selectZtzzqsData(Map<String, String> filter);

	List<Map<String, Object>> selectQynlzbData(Map<String, String> filter);

	List<Map<String, Object>> selectCsqyhyfxData(Map<String, String> filter);

	List<Map<String, Object>> selectQyjmbrxbfbData();

	List<Map<String, Object>> selectQyjmbrdqfbData();

	List<Map<String, Object>> selectQyjnlfbData();

	List<Map<String, Object>> selectQyjxlfbData();

	List<Map<String, Object>> selectMbrqyjxbnlzlData();

	Map<String, Object> selectCsqyzzfxData(Map<String,String> filterMap);

	List<Map<String, Object>> selectTzjephData();

	List<Map<String, Object>> selectTzhyfxData();

	Map<String, Object> selectQmztfzqsSlData();

	Map<String, Object> selectQmztfzqsZjData();

	List<Map<String, Object>> selectZttbzzData(Map<String, String> filterMap);

	Map<String, Object> selectZtlbfzfxData(Map<String, String> filterMap);

	Map<String, Object> selectZtlbfzfxTbData(Map<String, String> filterMap);

	List<Map<String, Object>> selectHytbzzlData();

	List<Map<String, Object>> selectHytbzzlTbData();

	Map<String, Object> selectScztzsfxSlData(Map<String, String> filterMap);

	Map<String, Object> selectScztzsfxZjData(Map<String, String> filterMap);

	List<Map<String, Object>> selectGssztslData(Map<String, String> filterMap);

	List<Map<String, Object>> selectTzjephjwData();

	List<Map<String, Object>> selectTzjephjwhsData();

	List<Map<String, Object>> selectTzjephhsData();

}