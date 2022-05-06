package com.liu.service;

import com.liu.bean.Storages;

import java.util.List;

public interface StoragesService {
      List<Storages> selectAllTree(String type);

      List<Storages> selectAll();

      void updateNumber(Storages storages);

      void deleteByPrimaryKey(Integer id);

      void deleteList(List<Integer> idList);

      void addItem(Storages storages);

      List<String> selectAllType();
}
