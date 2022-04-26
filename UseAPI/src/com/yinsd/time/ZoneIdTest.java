package com.yinsd.time;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/26 15:03
 */
public class ZoneIdTest {

    @Test
    public void ZoneIdTestDemo01(){
        //systemDefault获取当前时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //去除所有内置的时区设置，进行遍历
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String str1:availableZoneIds) {
            //System.out.println(str1);
        }

        //获取指定的时区的内的当前时间
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Jakarta"));
        System.out.println("Asia/Jakarta现在的时间是："+now);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
