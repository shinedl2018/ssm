package com.itcast.mapper;

import com.itcast.domain.Account;

import java.util.List;

public interface AccountMapper {
    List<Account> findAll() throws Exception;
    void save(Account account);
}
