package com.yinsd.time;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/21 9:52 PM
 */
public class DateFormat_test {

    @Test
    public void DateFormatTest(){
        DateFormat dateFormat = new SimpleDateFormat();
        System.out.println(dateFormat.getCalendar());
    }
}
