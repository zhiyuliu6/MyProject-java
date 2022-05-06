package com.liu;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liu.service.RegionService;
import com.liu.service.StaffLeaderService;
import com.liu.utils.RainFell;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
class Project2ApplicationTests {
//
//      @Autowired
//      private StaffLeaderService staffLeaderService;
//
//      @Autowired
//      private RegionService regionService;
//
//      @Autowired
//      private RainFell rainFell;
//
//
//      @Test
//      void contextLoads() {
//            List<Map<String, Object>> emptyAccountS = staffLeaderService.getEmptyAccountS();
//            System.out.println(emptyAccountS);
//      }
//
//      @Test
//      void redis(){
//
//            rainFell.doGet("https://datasetapi.qweather.com/v7/historical/weather?location=101101014&date=20220228&key=af197e9cedde407f9094669ed3247b73");
//            String a = rainFell.getA();
//            Object parse = JSON.parse(a);
//            System.out.println(parse);
//            System.out.println("---------------------------------");
//            JSONObject jsonObject = JSON.parseObject(a);
//            System.out.println(jsonObject);
//            JSONObject weatherDaily = jsonObject.getJSONObject("weatherDaily");
//            String precip = weatherDaily.getString("precip");
//            System.out.println(precip);
//
//      }
//


}
