package com.liu.service.impl;

import com.liu.bean.StaffLeader;
import com.liu.dao.StaffLeaderMapper;
import com.liu.service.StaffLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class StaffLeaderServiceImpl implements StaffLeaderService {

      @Autowired
      private StaffLeaderMapper staffLeaderMapper;

      @Override
      public List<StaffLeader> getAllStaffLeader() {
            return staffLeaderMapper.selectAll();
      }

      @Override
      public void updateStaffLeader(StaffLeader staffLeader) {
            staffLeaderMapper.updateByPrimaryKey(staffLeader);
      }

      @Override
      public void deleteStaffLeader(Integer id) {
            staffLeaderMapper.deleteByPrimaryKey(id);
      }

      @Override
      public Integer addStaffLeader(StaffLeader staffLeader) {
            staffLeaderMapper.insert(staffLeader);
            return staffLeader.getId();
      }

      @Override
      public List<Map<String, Object>> getEmptyAccountS() {
            return staffLeaderMapper.getEmptyAccountS();
      }

      @Override
      public void updateEmptyAccount(Map<String, Object> map) {
            staffLeaderMapper.updateEmptyAccount(map);
      }

      @Override
      public void unBindRegion(StaffLeader staffLeader) {
            staffLeaderMapper.unBindRegion(staffLeader);
      }
}
