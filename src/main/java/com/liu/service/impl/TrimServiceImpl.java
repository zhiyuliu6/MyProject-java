package com.liu.service.impl;

import com.liu.bean.TrimTask;
import com.liu.dao.TrimTaskMapper;
import com.liu.service.TrimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrimServiceImpl implements TrimService {

      @Autowired
      private TrimTaskMapper trimTaskMapper;

      @Override
      public int insert(TrimTask record) {
            return trimTaskMapper.insert(record);
      }
}
