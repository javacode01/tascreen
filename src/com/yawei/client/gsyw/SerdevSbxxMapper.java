package com.yawei.client.gsyw;

import com.yawei.model.gsyw.SerdevSbxx;
import com.yawei.model.gsyw.SerdevSbxxExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SerdevSbxxMapper {
    int countByExample(SerdevSbxxExample example);

    int deleteByExample(SerdevSbxxExample example);

    int deleteByPrimaryKey(String id);

    int insert(SerdevSbxx record);

    int insertSelective(SerdevSbxx record);

    List<SerdevSbxx> selectByExample(SerdevSbxxExample example);

    SerdevSbxx selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SerdevSbxx record, @Param("example") SerdevSbxxExample example);

    int updateByExample(@Param("record") SerdevSbxx record, @Param("example") SerdevSbxxExample example);

    int updateByPrimaryKeySelective(SerdevSbxx record);

    int updateByPrimaryKey(SerdevSbxx record);

	List<Map<String, Object>> selectZcsbqsfxData();

	Map<String, Object> selectZqrzGqczData();

	Map<String, Object> selectZqrzDcdyData();

	Map<String, Object> selectZqrzSbqzyData();

	List<Map<String, Object>> selectGqxzcsbData();
}