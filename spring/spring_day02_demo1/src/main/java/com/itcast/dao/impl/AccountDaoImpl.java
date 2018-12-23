package com.itcast.dao.impl;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.management.Query;
import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private QueryRunner runner;


    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public void deleteById(Integer id) {
        try {
            runner.update("delete from account where id =?",id);
        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

    public List<Account> findAll() {
        try {
            return runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void save(Account account) {
        try {
            runner.update("insert into account(id,name,money) values(?,?,?)",account.getId(),account.getName(),account.getMoney());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
