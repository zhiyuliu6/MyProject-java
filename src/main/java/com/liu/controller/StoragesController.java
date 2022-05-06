package com.liu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liu.bean.Storages;
import com.liu.service.StoragesService;
import com.liu.utils.PictureUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Storages")
public class StoragesController {

      @Autowired
      private StoragesService storagesService;

      @Autowired
      private PictureUpload pictureUpload;

      private String fileName;

      @GetMapping ("/selectAllTree")
      public List<Storages> selectAllTree( @RequestParam String type){
            return storagesService.selectAllTree(type);
      };

      @GetMapping("/selectAll")
      public List<Storages> selectAll(){
            return storagesService.selectAll();
      }

      @PostMapping("/updateNumber")
      public void updateNum(@RequestBody Storages storages){
            storagesService.updateNumber(storages);
      }

      @GetMapping("/deleteItem")
      public void deleteByPrimaryKey(@RequestParam Integer id){
            storagesService.deleteByPrimaryKey(id);
      }

      @PostMapping("/deleteList")
      public void deleteList(@RequestBody List<Integer> idList){
            storagesService.deleteList(idList);
      }

      @PostMapping("/addItem")
      public void addItem(@RequestBody Storages storages){
            storages.setPicUrl("http://localhost:8080/image/storageImage/"+this.fileName);
            storagesService.addItem(storages);
      }

      @PostMapping("/uploadPic")
      public void uploadPicture(@RequestParam("file") MultipartFile upload){
            this.fileName = pictureUpload.uploadPicture("storageImage", upload);
      }

      @GetMapping("/allType")
      public String allType(){
            return JSON.toJSONString(storagesService.selectAllType());
      }
}
