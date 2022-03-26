package com.liu.service;

import com.liu.bean.Account;

import java.util.List;

public interface AccountService {

      List<Account> selectAll();

      Integer addAccount(Account account);

      void deleteAccount(Integer id);

      void updateAccount(Account account);
}
