package com.liu.dao;

import com.liu.bean.RegionSoil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegionSoilMapper {

    Integer insert(RegionSoil record);

    List<RegionSoil> allInfo();
}