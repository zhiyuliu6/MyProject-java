package com.liu.service.impl;

import com.liu.bean.PlantingTask;
import com.liu.bean.TaskList;
import com.liu.bean.TrimTask;
import com.liu.bean.WateringTask;
import com.liu.dao.PlantingTaskMapper;
import com.liu.dao.TaskListMapper;
import com.liu.dao.TrimTaskMapper;
import com.liu.dao.WateringTaskMapper;
import com.liu.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentServiceImpl implements AssignmentService {

      @Autowired
      private TaskListMapper taskListMapper;

      @Autowired
      private PlantingTaskMapper plantingTaskMapper;

      @Autowired
      private WateringTaskMapper wateringTaskMapper;

      @Autowired
      private TrimTaskMapper trimTaskMapper;

      @Override
      public Integer insert(TaskList val) {
            taskListMapper.insert(val);
            return val.getTid();
      }

      @Override
      public List<PlantingTask> selectPlanting() {
            return plantingTaskMapper.selectAll();
      }

      @Override
      public List<WateringTask> selectWatering() {
            return wateringTaskMapper.selectAll();
      }

      @Override
      public List<TrimTask> selectTrim() {
            return trimTaskMapper.selectAll();
      }
}
