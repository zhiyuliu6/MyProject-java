package com.liu.dao;

import com.liu.bean.Region;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RegionMapper {

    List<Region> selectAll();

    List<Region> selectAllInfo();

    List<Map<String,Object>> selectAllSearchId();

    List<Region> regionRelationship();
}