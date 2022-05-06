package com.liu.service.impl;

import com.liu.bean.StaffApply;
import com.liu.dao.StaffApplyMapper;
import com.liu.service.StaffApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffApplyServiceImpl implements StaffApplyService {

      @Autowired
      private StaffApplyMapper staffApplyMapper;

      @Override
      public List<StaffApply> getAllStaffApply0() {
            return staffApplyMapper.selectAll0();
      }

      @Override
      public List<StaffApply> getAllStaffApplyNo0() {
            return staffApplyMapper.selectAllNo0();
      }

      @Override
      public void acceptApply(List<Integer> applyList) {
            staffApplyMapper.acceptApply(applyList);
      }

      @Override
      public void rejectApply(List<Integer> applyList) {
            staffApplyMapper.rejectApply(applyList);
      }

      @Override
      public void deleteByList(List<Integer> idList) {
            staffApplyMapper.deleteByList(idList);
      }
}
