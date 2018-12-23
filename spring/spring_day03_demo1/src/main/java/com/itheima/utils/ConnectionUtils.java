package com.itheima.utils;

import javax.sql.DataSource;
import java.sql.Connection;

public class ConnectionUtils {
    private ThreadLocal<Connection> ti = new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getConn() {
        try {
            Connection conn = ti.get();
            if (conn == null) {
                conn = dataSource.getConnection();
                ti.set(conn);
            }
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void remove() {
        ti.remove();
    }
}
