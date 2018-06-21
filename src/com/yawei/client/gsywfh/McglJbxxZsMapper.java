package com.yawei.client.gsywfh;

import com.yawei.model.gsywfh.McglJbxxZs;
import com.yawei.model.gsywfh.McglJbxxZsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface McglJbxxZsMapper {
    int countByExample(McglJbxxZsExample example);

    int deleteByExample(McglJbxxZsExample example);

    int insert(McglJbxxZs record);

    int insertSelective(McglJbxxZs record);

    List<McglJbxxZs> selectByExample(McglJbxxZsExample example);

    int updateByExampleSelective(@Param("record") McglJbxxZs record, @Param("example") McglJbxxZsExample example);

    int updateByExample(@Param("record") McglJbxxZs record, @Param("example") McglJbxxZsExample example);

	List<Map<String, Object>> selectMcyhzData();
}