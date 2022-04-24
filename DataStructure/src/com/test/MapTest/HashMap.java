package com.test.MapTest;

import org.junit.Test;

import java.util.Map;
import java.util.Set;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/19 6:15 PM
 */

/**
 * hashMap集合的特点：
 * HashMap是继承自Map集合接口的一个实现类
 *
 * @param
 * @return
 * @author  Yinsd
 */
public class HashMap {




    @Test
    public void HashMap(){
        Map<Integer, String> hashMap = new java.util.HashMap<>();
        for (int i = 0; i < 20; i++) {
            hashMap.put(i,i*2+"");
        }


        Set<Integer> integers = hashMap.keySet();

        for ( Integer in:integers) {
            String s = hashMap.get(in);
            System.out.print("第"+in+"个：");
            System.out.print(in);
            System.out.print("   ");
            System.out.print(s);
            System.out.println();
        }
    }
}
