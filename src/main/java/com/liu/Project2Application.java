package com.liu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.swing.*;

@SpringBootApplication
@EnableScheduling
@MapperScan(value = "com.liu.dao")
public class Project2Application {

      public static void main(String[] args) {
            SpringApplication.run(Project2Application.class, args);
      }

}
