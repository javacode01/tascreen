package com.yawei.client.gsyw;

import com.yawei.model.gsyw.Ai12315Djxx;
import com.yawei.model.gsyw.Ai12315DjxxExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Ai12315DjxxMapper {
    int countByExample(Ai12315DjxxExample example);

    int deleteByExample(Ai12315DjxxExample example);

    int insert(Ai12315Djxx record);

    int insertSelective(Ai12315Djxx record);

    List<Ai12315Djxx> selectByExample(Ai12315DjxxExample example);

    int updateByExampleSelective(@Param("record") Ai12315Djxx record, @Param("example") Ai12315DjxxExample example);

    int updateByExample(@Param("record") Ai12315Djxx record, @Param("example") Ai12315DjxxExample example);

	List<Map<String, Object>> selectXbwqData();

	List<Map<String, Object>> selectXfwqzlData(Map<String, String> filterMap);

	int selectTswtfxDlData(Map<String, String> filterMap);

	List<Map<String, Object>> selectTswtfxXlData(Map<String, String> filterMap);

	List<Map<String, Object>> selectGqtsjbfxData(Map<String, String> filterMap);

	List<Map<String, Object>> selectJbwtfxData();

	Map<String, Object> selectJbwtfxZtData();

}