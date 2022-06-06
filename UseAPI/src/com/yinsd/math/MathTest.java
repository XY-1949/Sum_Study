package com.yinsd.math.demo01;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/26 15:24
 */
public class MathTest {

    @Test
    public void MathTest01(){
        //返回对应数据的绝对值
        Integer abs = Math.abs(-1111);
        double random = Math.random();
        Set<Integer> objects = new TreeSet<>();
        Long i = Math.addExact(12311231231L,123123131L);
        System.out.println(i);

        System.out.println(abs);
    }
}
