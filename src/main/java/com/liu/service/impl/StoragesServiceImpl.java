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

      @Override
      public List<Storages> selectAll() {
            return storagesMapper.selectAll();
      }

      @Override
      public void updateNumber(Storages storages) {
            storagesMapper.updateByPrimaryKey(storages);
      }

      @Override
      public void deleteByPrimaryKey(Integer id) {
            storagesMapper.deleteByPrimaryKey(id);
      }

      @Override
      public void deleteList(List<Integer> idList) {
            storagesMapper.deleteByList(idList);
      }

      @Override
      public void addItem(Storages storages) {
            storagesMapper.insert(storages);
      }

      @Override
      public List<String> selectAllType() {
            return storagesMapper.selectAllType();
      }
}
