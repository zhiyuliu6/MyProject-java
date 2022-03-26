package com.liu.service;

import com.liu.bean.StaffMembers;

public interface StaffMembersService {

      void addStaffMember(StaffMembers staffMembers);

      void deleteStaffMember(String id);

      void deleteAll(Integer id);

}
