package com.liu.service;

import com.liu.bean.WeatherRecords;

public interface WeatherService {

      void deleteByRegionId(Integer id);

      int insert(WeatherRecords record);
}
