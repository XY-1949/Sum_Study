package com.yinsd.time;

import org.junit.Test;


import java.util.Calendar;


/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/21 9:50 PM
 */
public class Calender_test {

    /**
     *
     */
    @Test
    public void Calender_test(){

        /**
         * 1，实例化：
         *      方式一：创建其子类  GregorianCalendar  的对象
         *      方式二：调用其静态方法getInstance()
         * 2，Calendar的常用API方法：
         *      .add()  对指定的日期添加或减少指定的时间
         *      .get()  通过指定获取日期所对应的是本年，本月，本周的第几天
         *      .set()
         *      .roll
         *      .setTimeZone()——对给定的时区设置时区
         *      .getTimeZone()——获取指定对象的时区
         *      .getTime()——获取对象的时间
         */
        //1，创建了一个Calendar的实例化对象
        Calendar calendar = Calendar.getInstance();
        //System.out.println("calendar："+calendar);


        ////将系统当前日期减去5天
        calendar.add(Calendar.DATE,-5);
        System.out.println("DATE,-5："+calendar.getTime());

        //getFirstDayOfWeek
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        System.out.println("firstDayOfWeek:"+firstDayOfWeek);

        //.get()
        int i = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(calendar.getTime());
        System.out.println("DAY_OF_MONTH："+i);

        //.set()——修改对象的内容
        int i1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("i1："+i1);
        //设置本日是本月的第21天
        calendar.set(Calendar.DAY_OF_MONTH,21);
        int i2 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("i2："+i2);
        System.out.println(".set()："+calendar.getTime());

        //.add()
        calendar.add(Calendar.DAY_OF_MONTH,2);
        int i3 =  calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("i3："+ i3);


        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
