package com.test.MapTest;

import com.test.CollectionTest.List.Vactor;

import java.util.*;
import java.util.HashMap;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/19 6:15 PM
 */
public class TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        map.put("5",5);
        Set<String> set = map.keySet();
        for (String str:set) {
            System.out.println("map.get(str)："+map.get(str));
            System.out.println("map.get('3')"+map.get("3"));
            
        }
        System.out.println("===========");
        for (String str:set) {
            System.out.println("map.get(str)："+map.get(str));

        }

        List list = new ArrayList<>();
        for (int i = 0; i < ++i; i++) {


            
        }
        
    }
}
