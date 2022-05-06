package com.liu.service.impl;

import com.liu.bean.Account;
import com.liu.dao.AccountMapper;
import com.liu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService {

      @Autowired
      private AccountMapper accountMapper;

      @Override
      public List<Account> selectAll() {
            return accountMapper.selectAll();
      }

      @Override
      public Integer addAccount(Account account) {
            accountMapper.insert(account);
            return account.getId();
      }

      @Override
      public void deleteAccount(Integer id) {
            accountMapper.deleteByPrimaryKey(id);
      }

      @Override
      public void updateAccount(Account account) {
            accountMapper.updateByPrimaryKey(account);
      }

      @Override
      public Account selectAdmin(String usr) {
            return accountMapper.selectAdmin(usr);
      }
}
