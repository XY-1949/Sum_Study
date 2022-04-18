package com.puge.mybatis.mapper;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/18 5:12 PM
 */
public interface UserMapper {

    /**
     * MyBatis面向接口的两个一致：
     * 1，映射文件的namespace要和mapper层接口的地址和类名保持一致。
     * 2，映射文件中的SQL语句的id要和mapper层的接口的方法名保持一致。
     */

    /**
     * 添加用户信息
     * @param
     * @return
     * @author  Yinsd
     */

    //定义一个添加用户信息的接口
    int insertUser();


}
