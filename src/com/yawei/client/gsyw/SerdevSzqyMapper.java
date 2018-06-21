package com.yawei.client.gsyw;

import com.yawei.model.gsyw.SerdevSzqy;
import com.yawei.model.gsyw.SerdevSzqyExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SerdevSzqyMapper {
    int countByExample(SerdevSzqyExample example);

    int deleteByExample(SerdevSzqyExample example);

    int deleteByPrimaryKey(String id);

    int insert(SerdevSzqy record);

    int insertSelective(SerdevSzqy record);

    List<SerdevSzqy> selectByExample(SerdevSzqyExample example);

    SerdevSzqy selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SerdevSzqy record, @Param("example") SerdevSzqyExample example);

    int updateByExample(@Param("record") SerdevSzqy record, @Param("example") SerdevSzqyExample example);

    int updateByPrimaryKeySelective(SerdevSzqy record);

    int updateByPrimaryKey(SerdevSzqy record);

	List<Map<String, Object>> selectSzqysjfxData();

}