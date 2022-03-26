package com.liu.dao;

import com.liu.bean.SoilQuality;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SoilQualityMapper {

    int  insert(Double acreage);

    SoilQuality selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(SoilQuality record);
}