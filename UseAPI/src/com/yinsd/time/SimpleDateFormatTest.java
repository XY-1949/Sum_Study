package com.yinsd.time;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/21 9:52 PM
 */
public class SimpleDateFormatTest {
    /**
     * SimpleDateFormat的两个使用：
     *  1，格式化：
     *      将数据按照按照指定的格式输出
     *  2，解析：
     *      将一段特定格式的String字符串，转为Date类型的数据（字符串的格式必须根据SimpleDateFormat可识别的格式或通过构造器的参数体现）
     */

    @Test
    public synchronized void demo01(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(format);


    }

}
