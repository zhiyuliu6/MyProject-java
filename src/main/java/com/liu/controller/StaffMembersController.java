package com.liu.controller;

import com.liu.bean.StaffMembers;
import com.liu.service.StaffMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StaffMembersController {

      @Autowired
      private StaffMembersService staffMembersService;

      @PostMapping("/addStaffMembers")
      public void addStaffMember(@RequestBody StaffMembers staffMembers){
            staffMembersService.addStaffMember(staffMembers);
      }

      @PostMapping("/deleteStaffMember")
      public void deleteStaffMember(@RequestBody Map<String,String> map){
            staffMembersService.deleteStaffMember(map.get("id"));
      }

      @GetMapping ("/deleteAllStaffMember")
      public void deleteAll(Integer id){
            staffMembersService.deleteAll(id);
      }
}
