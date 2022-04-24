package com.test.CollectionTest.List;

import org.junit.Test;

import java.util.Vector;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/19 6:15 PM
 */
public class Vactor {

    @Test
    public void test(){
        Vector vactor = new Vector<>();

        String str = new String("txt");
        for (int i = 0; i < 20; i++) {
            str = str + i+"";
            vactor.add(i,str);
        }
        for (Object i : vactor) {
            System.out.println(i);
        }

    }
}
