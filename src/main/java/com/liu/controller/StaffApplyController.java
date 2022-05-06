package com.liu.controller;

import com.alibaba.fastjson.JSON;
import com.liu.service.StaffApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/apply")
public class StaffApplyController {
      @Autowired
      private StaffApplyService staffApplyService;

      @GetMapping("/allApply0")
      public String getAllApply0(){
            return JSON.toJSONString(staffApplyService.getAllStaffApply0());
      }

      @GetMapping("/allApplyNo0")
      public String getAllApplyNo0(){
            return JSON.toJSONString(staffApplyService.getAllStaffApplyNo0());
      }

      @PostMapping("/acceptApply")
      public void acceptApply(@RequestBody List<Integer> applyList){
            staffApplyService.acceptApply(applyList);
      }

      @PostMapping("/rejectApply")
      public void rejectApply(@RequestBody List<Integer> applyList){
            staffApplyService.rejectApply(applyList);
      }

      @PostMapping("/deleteApply")
      public void deleteApply(@RequestBody List<Integer> idList){
            staffApplyService.deleteByList(idList);
      }
}
