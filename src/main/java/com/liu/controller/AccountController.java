package com.liu.controller;

import com.alibaba.fastjson.JSON;
import com.liu.bean.Account;
import com.liu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class AccountController {

      @Autowired
      private AccountService accountService;

      @GetMapping("/allAccount")
      public String getTest(){
            List<Account> accounts = accountService.selectAll();
            return JSON.toJSONString(accounts);
      }

      @PostMapping("/addAccount")
      public Integer addAccount(@RequestBody Account account){
            return accountService.addAccount(account);
      }

      @PostMapping ("/deleteAccount")
      public void deleteAccount(@RequestBody Map<String,Integer> map){
            Integer deleteId = map.get("id");
            accountService.deleteAccount(deleteId);
      }

      @PostMapping("/updateAccount")
      public void updateAccount(@RequestBody Account account){
            accountService.updateAccount(account);
      }

}
