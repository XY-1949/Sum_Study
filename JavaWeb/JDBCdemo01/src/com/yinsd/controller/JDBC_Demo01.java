package com.yinsd.controller;

import com.yinsd.utils.JdbcUtil;

import java.sql.*;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/5/18 14:06
 */
public class JDBC_Connection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String name = "root";
        String password = "yinsd9981";
        String url = "jdbc:mysql://localhost:3306/test";

        //Connection connection = DriverManager.getConnection(url,name,password);
        Connection connection = JdbcUtil.getConn();

        Statement statement = connection.createStatement();

        String sql = "select * from users ";

        ResultSet resultSet = statement.executeQuery(sql);

        System.out.println(resultSet);


while (resultSet.next()){

    String username = resultSet.getString("username");
    String password1 = resultSet.getString("password");
    String email = resultSet.getString("email");
    String phone = resultSet.getString("phone");
    System.out.println("获取到的数据为"+username+"  "+password1+"  "+email+"  "+phone);
}

        connection.close();
        resultSet.close();
    }
}
