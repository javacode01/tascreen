package com.yawei.client.gsyw;

import com.yawei.model.gsyw.ZfglCfJbxx;
import com.yawei.model.gsyw.ZfglCfJbxxExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ZfglCfJbxxMapper {
    int countByExample(ZfglCfJbxxExample example);

    int deleteByExample(ZfglCfJbxxExample example);

    int insert(ZfglCfJbxx record);

    int insertSelective(ZfglCfJbxx record);

    List<ZfglCfJbxx> selectByExample(ZfglCfJbxxExample example);

    int updateByExampleSelective(@Param("record") ZfglCfJbxx record, @Param("example") ZfglCfJbxxExample example);

    int updateByExample(@Param("record") ZfglCfJbxx record, @Param("example") ZfglCfJbxxExample example);

	Map<String, Object> selectZfbaqkData();

	List<Map<String, Object>> selectAjlxfxData();

	List<Map<String, Object>> selectAjqsfxData();

	List<Map<String, Object>> selectGqxzfsjfxData(Map<String, String> filterMap);

	Map<String, Object> selectNdData();

	Map<String, Object> selectNdTqData();
}