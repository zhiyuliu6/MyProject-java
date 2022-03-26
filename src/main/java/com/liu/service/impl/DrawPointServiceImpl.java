package com.liu.service.impl;

import com.liu.bean.DrawPoint;
import com.liu.dao.DrawPointMapper;
import com.liu.service.DrawPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrawPointServiceImpl implements DrawPointService {

      @Autowired
      private DrawPointMapper drawPointMapper;

      @Override
      public void addPoint(List<DrawPoint> pointList) {
            drawPointMapper.addPoint(pointList);
      }
}
