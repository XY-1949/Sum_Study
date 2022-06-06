package com.yinsd.time;

import org.junit.Test;

import java.time.*;
import java.util.Date;
/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/23 3:38 PM
 */
public class JDK8DateTimeTest {

    @Test
    public void test(){

        //.now()——>获取当前的时间
        LocalTime now = LocalTime.now();
        System.out.println(now);//15:41:16.942

        LocalDate now1 = LocalDate.now();
        System.out.println(now1);//2022-04-23

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);//2022-04-23T15:41:16.943

        LocalDateTime localDateTime = LocalDateTime.of(2020, 12, 12, 12, 12, 12);
        System.out.println(localDateTime);//2020-12-12T12:12:12

        LocalDateTime min = LocalDateTime.MIN;

        System.out.println(min);


    }


    /**
     * Instant类类似于  java.util.Date类
     */
    @Test
    public void InstantTest2(){


        //now()获取现在零时区的时间
        Instant instant = Instant.now();
        System.out.println(instant);//2022-04-26T08:22:03.540Z
        //其中的T表示分隔符，Z表示的是UTC（世界标准时间，即0时区的实时时间，在标准时间上加上8小时，即东八区时间，也就是北京时间。 ）

        /**
         * 根据自己所处时区对0时区的时间进行修改
         * ZoneOffset：时区偏移量的设置。他的ofHours方法可以对时区进行修改
         *
         */
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2022-04-26T16:22:03.540+08:00

        /**
         * toEpochMilli获取当前时间代表的毫秒值
         */
        long l = instant.toEpochMilli();
        System.out.println("毫秒值："+l);//1650961323540
        Date date = new Date(l);
        System.out.println(date);//Tue Apr 26 16:22:03 CST 2022

        /**
         * 通过ofEpochMilli方法传入一个毫秒值将其转化为当前的时间
         */
        Instant instant1 = Instant.ofEpochMilli(l);
        System.out.println("当前的时间："+instant1);//2022-04-26T08:22:03.540Z


        //获取当前服务所处的时区地址
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId："+zoneId);//Asia/Shanghai

        //Clock：获取当前的时间
        Clock clock = Clock.system(zoneId);
        System.out.println(clock);//SystemClock[Asia/Shanghai]
        Instant now = Instant.now();
        System.out.println(now);//2022-04-26T08:22:03.685Z

    }
}
