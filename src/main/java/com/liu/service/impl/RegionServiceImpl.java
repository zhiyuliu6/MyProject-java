package com.liu.service.impl;

import com.liu.bean.Region;
import com.liu.bean.WeatherRecords;
import com.liu.dao.RegionMapper;
import com.liu.dao.WeatherRecordsMapper;
import com.liu.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RegionServiceImpl implements RegionService {

      @Autowired
      private RegionMapper regionMapper;

      @Autowired
      private WeatherRecordsMapper weatherRecordsMapper;

      @Override
      public List<Region> getAllRegion() {
            return regionMapper.selectAll();
      }

      @Override
      public List<Region> selectAllInfo() {
            return regionMapper.selectAllInfo();
      }

      @Override
      public List<Map<String,Object>> getAllRainFell(Integer id) {
            return weatherRecordsMapper.allRainFell(id);
      }

      @Override
      public List<Map<String, Object>> selectAllSearchId() {
            return regionMapper.selectAllSearchId();
      }

      @Override
      public List<Region> regionRelationship() {
            return regionMapper.regionRelationship();
      }

}
