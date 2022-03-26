package com.liu.dao;

import com.liu.bean.WeatherRecords;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface WeatherRecordsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(WeatherRecords record);

    WeatherRecords selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(WeatherRecords record);

    List<Map<String,Object>> allRainFell(Integer id);

    void deleteByRegionId(Integer id);
}