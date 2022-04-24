package com.yinsd.time;

import org.junit.Test;

import java.time.Instant;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/23 4:08 PM
 */
public class InstantTest {

    @Test
    public final void demo(){
        //获取当前  0时区  的时间。
        Instant instant  =  Instant.now();
        Instant instant1 = Instant.MAX;
        System.out.println(instant);
        System.out.println(instant1);


        System.out.println();
    }
}
