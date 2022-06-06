package com.yinsd.utils;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * JDBC的工具类
 * 加载驱动、建立连接、释放连接
 */
public class JdbcUtil {
    private static String className = "com.mysql.jdbc.Driver";
    private  static String user = "root";
    private  static String password = "yinsd9981";
    private  static String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";

    /**
     * 加载驱动
     * 静态代码块、
     */
    static {
        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * 创建连接
     */
    public static Connection getConn() throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);
        return conn;
    }
    /**
     * 释放连接
     */
    public static void release(Connection conn){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    //单元测试的方法：没有任何返回值的。
    //可以单独的去执行
    @Test
    public void testConn() throws SQLException {
        Connection conn = JdbcUtil.getConn();
        System.out.println(conn);
        System.out.println("单元测试方法执行了！！！");
    }
    public static void main(String[] args) {
        System.out.println("main方法执行了~~~");
    }
}
