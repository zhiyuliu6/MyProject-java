package com.liu.service.impl;

import com.liu.bean.Storages;
import com.liu.dao.StoragesMapper;
import com.liu.service.StoragesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoragesServiceImpl implements StoragesService {

      @Autowired
      private StoragesMapper storagesMapper;

      @Override
      public List<Storages> selectAllTree(String type) {
            return storagesMapper.selectAllTree(type);
      }
}
