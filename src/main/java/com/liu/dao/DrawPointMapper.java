package com.liu.dao;

import com.liu.bean.DrawPoint;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrawPointMapper {

      void addPoint(@Param("pointList") List<DrawPoint> pointList);
}
