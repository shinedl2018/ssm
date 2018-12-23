package com.itcast.service;

import com.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll() throws Exception;
    void save(Account account);
}