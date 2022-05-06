package com.liu.dao;

import com.liu.bean.Account;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AccountMapper {

    int deleteByPrimaryKey(Integer id);

    Integer insert(Account record);

    List<Account> selectAll();

    int updateByPrimaryKey(Account record);

    Account selectAdmin(String usr);
}