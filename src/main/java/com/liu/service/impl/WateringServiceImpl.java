package com.liu.service.impl;

import com.liu.bean.WateringTask;
import com.liu.dao.WateringTaskMapper;
import com.liu.service.WateringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WateringServiceImpl implements WateringService {

      @Autowired
      private WateringTaskMapper wateringTaskMapper;

      @Override
      public int insert(WateringTask record) {
            return wateringTaskMapper.insert(record);
      }
}
