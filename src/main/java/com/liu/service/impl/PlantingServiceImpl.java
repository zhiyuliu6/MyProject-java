package com.liu.service.impl;

import com.liu.bean.PlantingTask;
import com.liu.dao.PlantingTaskMapper;
import com.liu.service.PlantingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantingServiceImpl implements PlantingService {

      @Autowired
      private PlantingTaskMapper plantingTaskMapper;

      @Override
      public int insert(PlantingTask record) {
            return plantingTaskMapper.insert(record);
      }
}
