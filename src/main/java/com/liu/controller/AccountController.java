package com.liu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liu.bean.Account;
import com.liu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/account")
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

      @PostMapping("/validationAdmin")
      public int validationAdmin(@RequestBody Object account){
            String s = JSON.toJSONString(account);
            JSONObject jsonObject = JSON.parseObject(s);

            String usr = jsonObject.getString("username");
            String psw = jsonObject.getString("password");

            System.out.println(usr);
            System.out.println(psw);

            Account result = accountService.selectAdmin(usr);

            if (!ObjectUtils.isEmpty(result)){
                  String resultPsw = result.getPsw();
                  System.out.println(resultPsw);
                  if (resultPsw.equals(psw)){
                        System.out.println("密码正确");
                        String id = result.getId().toString();
                        return Integer.parseInt(id);
                  }else {
                        System.out.println("密码错误");
                        return -1;
                  }
            }else {
                  return -1;
            }
      }

}
