package com.itcast.service;

import com.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    void deleteById(Integer id);
    List<Account> findAll();
    void save(Account account);
}
