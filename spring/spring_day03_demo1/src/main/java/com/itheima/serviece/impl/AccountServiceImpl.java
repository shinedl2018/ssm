package com.itheima.serviece.impl;

import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.domain.Account;
import com.itheima.serviece.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDaoImpl accountDao;

    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String sourceName, String targetName, Float money) {
        Account source = accountDao.findByName("sourceName");
        Account target = accountDao.findByName("targetName");
        source.setMoney(source.getMoney()-money);
        target.setMoney(source.getMoney()+money);
        accountDao.updateAccount(source);
        accountDao.updateAccount(target);
    }
}
