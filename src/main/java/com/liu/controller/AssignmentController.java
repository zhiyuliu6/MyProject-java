package com.liu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liu.bean.PlantingTask;
import com.liu.bean.TaskList;
import com.liu.bean.TrimTask;
import com.liu.bean.WateringTask;
import com.liu.service.AssignmentService;
import com.liu.service.PlantingService;
import com.liu.service.TrimService;
import com.liu.service.WateringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignment")
public class AssignmentController {

      @Autowired
      private AssignmentService assignmentService;

      @Autowired
      private TrimService trimService;

      @Autowired
      private WateringService wateringService;

      @Autowired
      private PlantingService plantingService;

      @PostMapping("/add")
      public void addAssignment(@RequestBody Object obj){
            String s = JSON.toJSONString(obj);
            JSONObject jsonObject = JSON.parseObject(s);
            String assignmentType = jsonObject.getString("assignmentType");

            TaskList taskList = new TaskList();
            taskList.setFinished(0);
            taskList.setTaskNote(jsonObject.getString("taskNote"));
            taskList.setLeaderId(jsonObject.getInteger("leaderId"));
            taskList.setStartDate(jsonObject.getDate("startDate"));
            taskList.setTimeRange(jsonObject.getInteger("timeRange"));
            Integer insert = assignmentService.insert(taskList);
            switch (assignmentType){
                  case "planting":
                        PlantingTask plantingTask = new PlantingTask();
                        plantingTask.setTid(insert);
                        plantingTask.setTreeNum(jsonObject.getInteger("treeNumber"));
                        plantingTask.setTreeType(jsonObject.getString("treeType"));
                        plantingService.insert(plantingTask);
                        break;
                  case "watering":
                        WateringTask wateringTask = new WateringTask();
                        wateringTask.setTid(insert);
                        wateringTask.setTimes(jsonObject.getInteger("waterTimes"));
                        wateringService.insert(wateringTask);
                        break;
                  case "pruning":
                        TrimTask trimTask = new TrimTask();
                        trimTask.setTid(insert);
                        trimTask.setType(jsonObject.getString("trimType"));
                        trimService.insert(trimTask);
                        break;
            }

      }

      @GetMapping("/planting")
      public String selectPlanting(){
            return JSON.toJSONString(assignmentService.selectPlanting());
      };

      @GetMapping("/watering")
      public String selectWatering(){
            return JSON.toJSONString(assignmentService.selectWatering());
      };

      @GetMapping("/pruning")
      public String selectTrim(){
            return JSON.toJSONString(assignmentService.selectTrim());
      };
}
