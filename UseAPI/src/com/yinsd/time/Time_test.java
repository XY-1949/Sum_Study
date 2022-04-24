package com.yinsd.time;

import org.junit.Test;

import java.sql.Time;
import java.util.Date;


/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/21 9:51 PM
 */
public class Time_test {

    @Test
    public void timeTest(){
        Date date = new Date();
        Time time = new Time(9981);
        System.out.println(time);
        int i = time.compareTo(date);
        System.out.println("date："+date+"   //\\      " +""+i);
    }
}
