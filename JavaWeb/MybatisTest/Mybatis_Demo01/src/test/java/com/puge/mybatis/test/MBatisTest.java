package com.puge.mybatis.test;

import com.puge.mybatis.mapper.UserMapper;
import com.puge.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/18 9:16 PM
 */
public class MBatisTest{

    @Test
    public void myBatisTest() throws IOException {
        // 加载核心配置文件:以字节输入流的形式获取核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //创建创建SqlSessionFactory的构建工具SqlSessionFactoryBuilder，并通过他的构造器实例化后获取他的对象，
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //这是一个使用工厂模式封装好的apache的工具
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        //获取MyBatis操作数据库的会话对象SqlSession。
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /**
         * sqlSession的getMapper方法里面传入一个Class文件，通过底层的处理，会返回他的实例化对象。
         *  一个正常的类可以直接进行实例化，获取他的实例化对象，但是一个接口怎么办哪，
         *  这个方法的底层底层通过代理模式的方法，为接口创建了一个实现类，实现了他的实例化处理，返回了他的实例化对象。
         *  可以获取UserMapper的实例化对象。
         */
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        int result = userMapper.insertUser();
        //提交事务
        sqlSession.commit();
        System.out.println("result："+result);
    }
}
