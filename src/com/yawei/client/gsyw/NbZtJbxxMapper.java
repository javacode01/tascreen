package com.yawei.client.gsyw;

import com.yawei.model.gsyw.NbZtJbxx;
import com.yawei.model.gsyw.NbZtJbxxExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface NbZtJbxxMapper {
    int countByExample(NbZtJbxxExample example);

    int deleteByExample(NbZtJbxxExample example);

    int insert(NbZtJbxx record);

    int insertSelective(NbZtJbxx record);

    List<NbZtJbxx> selectByExample(NbZtJbxxExample example);

    int updateByExampleSelective(@Param("record") NbZtJbxx record, @Param("example") NbZtJbxxExample example);

    int updateByExample(@Param("record") NbZtJbxx record, @Param("example") NbZtJbxxExample example);

	Map<String, Object> selectNbjkData();

	List<Map<String, Object>> selectGxqnbqkData();

	Map<String, Object> selectNdqsnbqkData();

	List<Map<String, Object>> selectNdnseData();

	List<Map<String, Object>> selectNdlreData();

	Map<String, Object> selectDzzjsqkQyData();

	Map<String, Object> selectDzzjsqkQyTqData();

	Map<String, Object> selectDzzjsqkGtData();

	Map<String, Object> selectGqxDjqkQyData();

	List<Map<String, Object>> selectGqxDjqkData();

	List<Map<String, Object>> selectQxdzzphbData();

	List<Map<String, Object>> selectQxdyrsphbData();

	Map<String, Object> selectDzzzzqsData();

	Map<String, Object> selectDyrszzqsData();
}