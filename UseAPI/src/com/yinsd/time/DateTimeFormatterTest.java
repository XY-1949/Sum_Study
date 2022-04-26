package com.yinsd.time;

import com.sun.xml.internal.ws.util.StringUtils;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/25 22:22
 */
public class DateTimeFormatterTest {

    /**
     * 日期时间格式化工具，解析日期或格式化，类似于jdk1.0的SimpleDateFormat
     *
     * 有三种创建的方式：
     *  1，
     */

    @Test
    public void DateTimeFormatterDemo01() throws InterruptedException {

        StringUtils stringUtils = new StringUtils();

        //第一种方式：创建对象：预定义的标准格式： ISO_LOCAL_DATE_TIME
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        //格式化：日期——>字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = dateTimeFormatter1.format(localDateTime);
        System.out.println(dateTimeFormatter1);
        /**
         * ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))'T'(Value(HourOfDay,2)':'Value(MinuteOfHour,2)[':'Value(SecondOfMinute,2)[Fraction(NanoOfSecond,0,9,DecimalPoint)]])
         */
        System.out.println(localDateTime);//2022-04-26T10:51:12.068
        System.out.println(format);//2022-04-26T10:51:12.068

        //格式化：字符串——>转日期
        TemporalAccessor parse = dateTimeFormatter1.parse("2022-04-26T10:51:12.068");
        System.out.println(parse);

        //第二种方式：本地化相关的格式：如：ofLocalizedDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //格式化输出
        String format1 = formatter.format(localDateTime);
        System.out.println("format1："+format1);

        //本地化相关的格式：ofLocalizedDate
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        //格式化输出
        String format2 = formatter1.format(localDateTime);
        System.out.println("format2："+format2);


        //第三种方式：自定义日期时间格式
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy-M-d h:m:s");
        String format3 = formatter2.format(LocalDateTime.now());
        System.out.println(format3);



    }
}
