package com.liu.service;

import com.liu.bean.PlantingTask;
import com.liu.bean.TaskList;
import com.liu.bean.TrimTask;
import com.liu.bean.WateringTask;

import java.util.List;

public interface AssignmentService {
      Integer insert(TaskList val);

      List<PlantingTask> selectPlanting();

      List<WateringTask> selectWatering();

      List<TrimTask> selectTrim();
}
