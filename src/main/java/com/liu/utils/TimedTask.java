package com.liu.utils;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liu.bean.WeatherRecords;
import com.liu.service.RegionService;
import com.liu.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;

//@Component
public class TimedTask {

      @Autowired
      private RegionService regionService;

      @Autowired
      private WeatherService weatherService;

      @Autowired
      private RainFell rainFell;

      //开启定时器，定时每天的凌晨一点
//      @Bean
//      @Scheduled(cron="0 0 1 * * ?")
      public void openTimer(){

            List<Map<String, Object>> maps = regionService.selectAllSearchId();
            LocalDate localDate = LocalDate.now();
            LocalDate yesterday = localDate.plusDays(-1);
            String format = yesterday.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            String basicUrl = "https://datasetapi.qweather.com/v7/historical/weather?location=";
            String key = "&key=af197e9cedde407f9094669ed3247b73";


            for(Map<String,Object> region : maps){
                  int regionId = (int) region.get("regionId");
                  String searchId = String.valueOf(region.get("searchId"));
                  String sendUrl = basicUrl+searchId+"&date="+format+key;
                  rainFell.doGet(sendUrl);
                  String a = rainFell.getA();
                  JSONObject jsonObject = JSON.parseObject(a);
                  JSONObject weatherDaily = jsonObject.getJSONObject("weatherDaily");
                  Double precip = Double.valueOf(weatherDaily.getString("precip"));

                  weatherService.deleteByRegionId(regionId);
                  WeatherRecords weatherRecords = new WeatherRecords();
                  Date date = Date.from(yesterday.atStartOfDay(ZoneOffset.ofHours(8)).toInstant());
                  weatherRecords.setDate(date);
                  weatherRecords.setRegionId(regionId);
                  weatherRecords.setRainFell(precip);
                  weatherService.insert(weatherRecords);
            }
      }
}
