package com.liu.service;

import com.liu.bean.StaffLeader;

import java.util.List;
import java.util.Map;

public interface StaffLeaderService {

      List<StaffLeader> getAllStaffLeader();

      void updateStaffLeader(StaffLeader staffLeader);

      void deleteStaffLeader(Integer id);

      Integer addStaffLeader(StaffLeader staffLeader);

      List<Map<String,Object>> getEmptyAccountS();

      void updateEmptyAccount(Map<String,Object> map);

      void unBindRegion(StaffLeader staffLeader);

}
