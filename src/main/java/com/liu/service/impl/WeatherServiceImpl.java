package com.liu.service.impl;

import com.liu.bean.WeatherRecords;
import com.liu.dao.WeatherRecordsMapper;
import com.liu.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {

      @Autowired
      private WeatherRecordsMapper weatherRecordsMapper;

      @Override
      public void deleteByRegionId(Integer id) {
            weatherRecordsMapper.deleteByRegionId(id);
      }

      @Override
      public int insert(WeatherRecords record) {
            weatherRecordsMapper.insert(record);
            return 0;
      }
}
