package com.liu.dao;

import com.liu.bean.StaffLeader;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StaffLeaderMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(StaffLeader record);

    List<StaffLeader> selectAll();

    int updateByPrimaryKey(StaffLeader record);

    @MapKey("id")
    List<Map<String,Object>> getEmptyAccountS();

    void updateEmptyAccount(Map<String,Object> map);

    void unBindRegion (StaffLeader staffLeader);
}