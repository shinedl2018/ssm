package com.itcast.dao;

import com.itcast.domain.Account;

import java.util.List;

public interface AccountDao {
    void deleteById(Integer id);
    List<Account> findAll();
    void save(Account account);
}
