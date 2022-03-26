package com.liu.service.impl;

import com.liu.dao.TreeStateMapper;
import com.liu.service.TreeStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TreeStateServiceImpl implements TreeStateService {

      @Autowired
      private TreeStateMapper treeStateMapper;

      @Override
      public List<Map<String, Object>> allTypeTree(Integer id) {
            return treeStateMapper.allTypeTree(id);
      }
}
