package com.yinsd.controller;

import com.yinsd.utils.JdbcUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/5/19 16:42
 */
public class JDBC_update {

    @Test
    public void JdbcTest() throws ClassNotFoundException, SQLException {

        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //获取数据库连接对象
        //Connection conn = JdbcUtil.getConn();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","yinsd9981");

        //定义sql语句
        //查询
        String sql1 = "select * from users where id = 1 ;";
        //修改
        String sql2 = "update users set username = '我被改了',email = 'yyy@puge.net' where id =2;";
        //添加
        String sql3 = "insert into users values(5,'山西应用科技','yyds','ysd@gmail.com','12345678910');";
        //删除
        String sql4 = "delete from users where id = 5;";

        Statement stat = conn.createStatement();

        //
        int result1= stat.executeUpdate(sql2);
        int result4 = stat.executeUpdate(sql4);
        System.out.println(result1);
        System.out.println(result4);
        if (result1 == 1 && result4 == 1){
            System.out.println("sql语句执行正常");
            return;
        }else {
            System.out.println("sql语句执行异常,请检查你的sql是否存在语法错误");

        }

        stat.close();
        conn.close();
    }
}
