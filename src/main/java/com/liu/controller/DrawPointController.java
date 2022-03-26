package com.liu.controller;

import com.liu.bean.DrawPoint;
import com.liu.service.DrawPointService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DrawPointController {

      @Autowired
      private DrawPointService drawPointService;

      @PostMapping("/addPoint")
      public void addPoint(@RequestBody List<DrawPoint> pointList){
            drawPointService.addPoint(pointList);
      }

}
