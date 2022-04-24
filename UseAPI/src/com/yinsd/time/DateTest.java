package com.yinsd.time;

import org.junit.Test;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/21 5:16 PM
 */
public class DateTest {

    /**
     * java.util.Date 和 java.sql.Date
     *
     * 1970年1月1日0时0分0秒：时间戳——为什么使用这个日期作为时间戳
     * 输出当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差
     * @param
     * @return
     * @author  Yinsd
     */
    @Test
    public void test(){
        long time = System.currentTimeMillis();
        System.out.println(time);

        Date date1 = new Date(1650535433437L);
        //chou
        TimeZone timeZone;
        Calendar calendar;
        GregorianCalendar  GregorianCalendar;

        Time  time2 = new Time(time);
        Timestamp Timestamp;
        DateFormat DateFormat;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH-mm-ss");
        String format = simpleDateFormat.format(date1);
        System.out.println("format："+format);
        System.out.println("date1："+date1);
        System.out.println("time1:"+time2);


        /**
         * Date的两种用法：
         *  1，空参构造：获取当前的时间
         *  2，有参构造：将Long类型的毫秒值，转化为Date类型
         */
        Date date = new Date();
        System.out.println();
        long time1 = date.getTime();
        String s = date.toString();
        System.out.println("time1："+time1);
        System.out.println("s："+s);
    }

    @Test
    public void  demo01(){
        long l = System.currentTimeMillis();
        System.out.println(l);

        Date date = new Date(l);
        System.out.println(date);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("YY.MM.dd HH:mm:ss");
        String format = simpleDateFormat2.format(date);
        System.out.println(format);

        Date date1 = new Date(0);
        System.out.println(date1);



    }
}
