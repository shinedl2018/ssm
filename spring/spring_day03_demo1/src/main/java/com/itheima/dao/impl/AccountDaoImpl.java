package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private QueryRunner runner;
    private ConnectionUtils connectionUtils;


    public void setQueryRunner(QueryRunner queryRunner) {
        this.runner = queryRunner;
    }

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    public Account findByName(String name) {
        try {
            return runner.query(connectionUtils.getConn(),"select * from account where name = ?",new BeanHandler<Account>(Account.class),name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void updateAccount(Account account) {
        try {
            runner.update(connectionUtils.getConn(),"update account set money = ? where name= ?",account.getMoney(),account.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public QueryRunner getRunner() {
        return runner;
    }
}
