package com.liu.service.impl;

import com.liu.bean.StaffMembers;
import com.liu.dao.StaffMembersMapper;
import com.liu.service.StaffMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffMembersImpl implements StaffMembersService {

      @Autowired
      private StaffMembersMapper staffMembersMapper;

      @Override
      public void addStaffMember(StaffMembers staffMembers) {
            staffMembersMapper.insert(staffMembers);
      }

      @Override
      public void deleteStaffMember(String id) {
            staffMembersMapper.deleteByPrimaryKey(id);
      }

      @Override
      public void deleteAll(Integer id) {
            staffMembersMapper.deleteByStaffLeaderIdInt(id);
      }
}
