package com.yinsd.time;

import org.junit.Test;

import java.time.*;
import java.util.List;
import java.util.Vector;

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
    }

    @Test
    public void test2(){
        Instant instant = Instant.now();
        System.out.println(instant);
        Clock clock = Clock.systemUTC();
        System.out.println(clock);
        Instant now = Instant.now();
        System.out.println(now);

        List vector = new Vector<>();


    }
}
