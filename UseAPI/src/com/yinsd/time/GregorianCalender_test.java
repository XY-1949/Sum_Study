package com.yinsd.time;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/21 9:51 PM
 */
public class GregorianCalender_test {


    @Test
    public void GregorianCalendartest(){
        //创建了一个GregorianCalendar对象,
        //GregorianCalendar gregorianCalendar = new GregorianCalendar("YYYY-MM-dd HH-mm-ss");
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println("gregorianCalendar对象："+gregorianCalendar);

        System.out.println("=================");
        gregorianCalendar.set(12,12,12,12,12,12);
        System.out.println(gregorianCalendar);
        //获取对象内的时间
        Date gregorianChange = gregorianCalendar.getGregorianChange();
        System.out.println("gregorianChange对象："+gregorianChange);
    }

    @Test
    public void CalendarTest(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println("=========.=========.");
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        Date date = new Date();



    }
}
