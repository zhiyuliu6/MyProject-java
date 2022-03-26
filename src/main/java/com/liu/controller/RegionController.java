package com.liu.controller;

import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liu.bean.Region;
import com.liu.bean.RegionSoil;

import com.liu.service.RegionService;
import com.liu.service.RegionSoilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;


@RestController
public class RegionController {

      @Autowired
      private RegionService regionService;

      @Autowired
      private RegionSoilService regionSoilService;

      @GetMapping("/getAllRegion")
      public String getAllRegion(){
            return JSON.toJSONString(regionService.getAllRegion());
      }

      @GetMapping("/getAllRegionInfo")
      public String getAllRegionInfo(){
            return JSON.toJSONString(regionService.selectAllInfo());
      }

      @PostMapping("/addSmallRegional")
      public Integer addSmallR(@RequestBody Map<String, Object> map) throws JsonProcessingException {
            ObjectMapper objectMapper = new ObjectMapper();
            String regionSoil1 = objectMapper.writeValueAsString(map.get("regionSoil"));
            RegionSoil regionSoil2 = objectMapper.readValue(regionSoil1, RegionSoil.class);
            Double acreage = (Double) map.get("acreage");
            return regionSoilService.addSmallRegion(regionSoil2,acreage);
      }

      @GetMapping("/allRainFell")
      public List<Map<String,Object>> getAllRainFell(@RequestParam("id")  Integer id){
            System.out.println(regionService.getAllRainFell(id));
            return regionService.getAllRainFell(id);
      }

      @GetMapping("/regionRelationship")
      public String getRegionRelationship(){
            return  JSON.toJSONString(regionService.regionRelationship());
      }

}
