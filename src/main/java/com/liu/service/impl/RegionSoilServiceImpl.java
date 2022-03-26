package com.liu.service.impl;

import com.liu.bean.RegionSoil;
import com.liu.dao.RegionSoilMapper;
import com.liu.dao.SoilQualityMapper;
import com.liu.dao.TreeStateMapper;
import com.liu.service.RegionSoilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionSoilServiceImpl implements RegionSoilService {

      @Autowired
      private RegionSoilMapper regionSoilMapper;

      @Autowired
      private SoilQualityMapper soilQualityMapper;

      @Autowired
      private TreeStateMapper treeStateMapper;

      @Override
      public Integer addSmallRegion(RegionSoil regionSoil,Double acreage) {
            soilQualityMapper.insert(acreage);
            treeStateMapper.insert();
            regionSoilMapper.insert(regionSoil);
            return regionSoil.getId();
      }
}
