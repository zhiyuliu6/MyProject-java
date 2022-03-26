package com.liu.dao;

import com.liu.bean.StaffMembers;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffMembersMapper {


    int deleteByPrimaryKey(String id);

    int deleteByStaffLeaderIdInt(Integer id);

    int insert(StaffMembers record);

    StaffMembers selectByLeaderKey(Integer id);

}