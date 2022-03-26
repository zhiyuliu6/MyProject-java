package com.liu.service;

import com.liu.bean.Storages;

import java.util.List;

public interface StoragesService {
      List<Storages> selectAllTree(String type);
}
