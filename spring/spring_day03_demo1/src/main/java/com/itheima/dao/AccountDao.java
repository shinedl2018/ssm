package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {
    Account findByName(String name);
    void updateAccount(Account account);
}
