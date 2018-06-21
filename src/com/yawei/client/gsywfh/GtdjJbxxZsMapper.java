package com.yawei.client.gsywfh;

import com.yawei.model.gsywfh.GtdjJbxxZs;
import com.yawei.model.gsywfh.GtdjJbxxZsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GtdjJbxxZsMapper {
    int countByExample(GtdjJbxxZsExample example);

    int deleteByExample(GtdjJbxxZsExample example);

    int deleteByPrimaryKey(String pripid);

    int insert(GtdjJbxxZs record);

    int insertSelective(GtdjJbxxZs record);

    List<GtdjJbxxZs> selectByExample(GtdjJbxxZsExample example);

    GtdjJbxxZs selectByPrimaryKey(String pripid);

    int updateByExampleSelective(@Param("record") GtdjJbxxZs record, @Param("example") GtdjJbxxZsExample example);

    int updateByExample(@Param("record") GtdjJbxxZs record, @Param("example") GtdjJbxxZsExample example);

    int updateByPrimaryKeySelective(GtdjJbxxZs record);

    int updateByPrimaryKey(GtdjJbxxZs record);
}