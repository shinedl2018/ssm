package com.itcast.service.impl;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import com.itcast.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void deleteById(Integer id) {
        accountDao.deleteById(id);

    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }
    public void save(Account account){
        accountDao.save(account);
    }
}
