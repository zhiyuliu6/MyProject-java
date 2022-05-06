package com.liu.controller;

import com.alibaba.fastjson.JSON;
import com.liu.bean.StaffLeader;
import com.liu.service.StaffLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/leader")
public class StaffLeaderController {

      @Autowired
      private StaffLeaderService staffLeaderService;

      @GetMapping("/allStaffLeader")
      public String getAllStaffLeader(){
            return JSON.toJSONString(staffLeaderService.getAllStaffLeader());
      }

      @PostMapping("/updateStaffLeader")
      public void updateStaffLeader(@RequestBody StaffLeader staffLeader){
            staffLeaderService.updateStaffLeader(staffLeader);
      }

      @PostMapping("/deleteStaffLeader")
      public void deleteStaffLeader(@RequestBody Map<String,Integer> map){
            Integer deleteId = map.get("id");
            System.out.println(deleteId);
            staffLeaderService.deleteStaffLeader(deleteId);
      }

      @PostMapping("/addStaffLeader")
      public Integer addStaffLeader(@RequestBody StaffLeader staffLeader){
            return staffLeaderService.addStaffLeader(staffLeader);
      }

      @GetMapping("/getEmptyAccount")
      public List<Map<String, Object>> getEmptyAccount(){
            return staffLeaderService.getEmptyAccountS();
      }

      @PostMapping("/updateEmptyAccount")
      public void updateEmptyAccount(@RequestBody Map<String, Object> map){
            staffLeaderService.updateEmptyAccount(map);
      }

      @PostMapping("/unBindRegion")
      public void unBindRegion(@RequestBody StaffLeader staffLeader){
            staffLeaderService.unBindRegion(staffLeader);
      }
}
