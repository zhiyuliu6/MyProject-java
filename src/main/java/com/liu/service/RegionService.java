package com.liu.service;

import com.liu.bean.Region;

import java.util.List;
import java.util.Map;

public interface RegionService {

      List<Region> getAllRegion();

      List<Region> selectAllInfo();

      List<Map<String,Object>> getAllRainFell(Integer id);

      List<Map<String,Object>> selectAllSearchId();

      List<Region> regionRelationship();
}
