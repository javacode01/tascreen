package com.yawei.client.gsywfh;

import com.yawei.model.gsywfh.QydjJbxxZs;
import com.yawei.model.gsywfh.QydjJbxxZsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface QydjJbxxZsMapper {
    int countByExample(QydjJbxxZsExample example);

    int deleteByExample(QydjJbxxZsExample example);

    int insert(QydjJbxxZs record);

    int insertSelective(QydjJbxxZs record);

    List<QydjJbxxZs> selectByExample(QydjJbxxZsExample example);

    int updateByExampleSelective(@Param("record") QydjJbxxZs record, @Param("example") QydjJbxxZsExample example);

    int updateByExample(@Param("record") QydjJbxxZs record, @Param("example") QydjJbxxZsExample example);

	List<Map<String, Object>> selectSldjData();

	List<Map<String, Object>> selectDjphbData();

	List<Map<String, Object>> selectBgdjNowData();

	List<Map<String, Object>> selectBgdjBeforeData();

	List<Map<String, Object>> selectBadjData();

	List<Map<String, Object>> selectZxdjData();
}