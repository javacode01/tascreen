package com.yawei.client.gsyw;

import com.yawei.model.gsyw.PubOrgan;
import com.yawei.model.gsyw.PubOrganExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PubOrganMapper {
    int countByExample(PubOrganExample example);

    int deleteByExample(PubOrganExample example);

    int deleteByPrimaryKey(String organCode);

    int insert(PubOrgan record);

    int insertSelective(PubOrgan record);

    List<PubOrgan> selectByExample(PubOrganExample example);

    PubOrgan selectByPrimaryKey(String organCode);

    int updateByExampleSelective(@Param("record") PubOrgan record, @Param("example") PubOrganExample example);

    int updateByExample(@Param("record") PubOrgan record, @Param("example") PubOrganExample example);

    int updateByPrimaryKeySelective(PubOrgan record);

    int updateByPrimaryKey(PubOrgan record);
}