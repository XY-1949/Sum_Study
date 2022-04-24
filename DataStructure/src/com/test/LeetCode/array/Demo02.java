package com.test.LeetCode.array;

import org.junit.Test;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/21 4:30 PM
 */
public class Demo02 {

    @Test
    public void test(){

        int i = 34;
        String str = "332322323232333233333333333333222222232323232";
        int i2 = str.hashCode();
        System.out.println(i2);
        String s = Integer.toBinaryString(i2);
        System.out.println(s+" ："+s.length());

    }
}
