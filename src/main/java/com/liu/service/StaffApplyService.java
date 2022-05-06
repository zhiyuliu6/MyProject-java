package com.liu.service;

import com.liu.bean.StaffApply;

import java.util.List;

public interface StaffApplyService {
      List<StaffApply> getAllStaffApply0();
      List<StaffApply> getAllStaffApplyNo0();
      void acceptApply(List<Integer> applyList);
      void rejectApply(List<Integer> applyList);
      void deleteByList(List<Integer> idList);
}
