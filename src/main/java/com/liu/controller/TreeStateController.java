package com.liu.controller;

import com.liu.service.TreeStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TreeStateController {

      @Autowired
      private TreeStateService treeStateService;

      @GetMapping("/allTypeTree")
      public List<Map<String,Object>> allTypeTree(@RequestParam("id") Integer id){
                return treeStateService.allTypeTree(id);
      }
}
