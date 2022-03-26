package com.liu.dao;

import com.liu.bean.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {

    int deleteByPrimaryKey(Integer id);

    Integer insert(Account record);

    List<Account> selectAll();

    int updateByPrimaryKey(Account record);


}