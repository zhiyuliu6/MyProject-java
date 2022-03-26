package com.liu.controller;

import com.liu.bean.Storages;
import com.liu.service.StoragesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Storages")
public class StoragesController {

      @Autowired
      private StoragesService storagesService;

      @GetMapping ("/selectAllTree")
      public List<Storages> selectAllTree( @RequestParam String type){
            return storagesService.selectAllTree(type);
      };
}
