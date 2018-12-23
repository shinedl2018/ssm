package com.itheima.utils;


import java.sql.SQLException;

public class TanscationManager {
    private ConnectionUtils cUtils;

    public void setcUtils(ConnectionUtils cUtils) {
        this.cUtils = cUtils;
    }
    public void begin(){
        try {
            cUtils.getConn().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void commit(){
        try {
            cUtils.getConn().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void rollback(){
        try {
            cUtils.getConn().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void close(){
        try {
            cUtils.getConn().close();
            cUtils.remove();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
