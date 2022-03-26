package com.liu.service.impl;

import com.liu.dao.SoilQualityMapper;
import com.liu.service.SoilQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoilQualityServiceImpl implements SoilQualityService {

      @Autowired
      private SoilQualityMapper soilQualityMapper;

      @Override
      public void addNewSoil(Double acreage) {
            soilQualityMapper.insert(acreage);
      }
}
