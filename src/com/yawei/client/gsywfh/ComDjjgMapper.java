package com.yawei.client.gsywfh;

import com.yawei.model.gsywfh.ComDjjg;
import com.yawei.model.gsywfh.ComDjjgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComDjjgMapper {
    int countByExample(ComDjjgExample example);

    int deleteByExample(ComDjjgExample example);

    int insert(ComDjjg record);

    int insertSelective(ComDjjg record);

    List<ComDjjg> selectByExample(ComDjjgExample example);

    int updateByExampleSelective(@Param("record") ComDjjg record, @Param("example") ComDjjgExample example);

    int updateByExample(@Param("record") ComDjjg record, @Param("example") ComDjjgExample example);
}