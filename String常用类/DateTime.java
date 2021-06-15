package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        //Instant使用
        //now()静态方法,返回默认UTC时区的Instant类的对象
        Instant instant = Instant.now();
        System.out.println(instant);

        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        //toEpochMilli() 获取自1970年-01-01 00:00:00到当前的毫秒数
        long milli = instant.toEpochMilli();
        System.out.println(milli);

        //ofEpochMilli():通过给定的毫秒数,获取Instance实例

        Instant instant1 = Instant.ofEpochMilli(1623760382802L);
        System.out.println(instant1);
    }


    public static void main2(String[] args) {
        //now()获取当前日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //of()设定指定年\月\日\时,没有偏移量,设置多少就是多少
        LocalDate localDate1 = LocalDate.of(2030,5,10);
        System.out.println(localDate1);

        LocalTime localTime1 = LocalTime.of(15,15,15);
        System.out.println(localTime1);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1,localTime1);
        System.out.println(localDateTime1);

        //getXxx():获取相关信息
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDateTime.getDayOfYear());

        //with设置相关属性
        LocalDate localDate2 = localDate.withMonth(1);
        System.out.println(localDate2);

        //plus()向当前对象加几天,几小时

        System.out.println(localDate2.plusMonths(2));


    }
    public static void main1(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat();
        String format = sdf.format(date);
        System.out.println(format);
        //******************************************
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date1 = new Date();
        String format2 = sdf1.format(date1);
        System.out.println(format2);
        String str1 = "2025-02-03 22:23:26";
        Date date2 = sdf1.parse(str1);
        System.out.println(date2);

        //联系,字符串"2020-09-08"转换为sql.Date;

        String str2 = "2020-09-08";

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date3 = sdf2.parse(str2);
        System.out.println(date3);

        java.sql.Date date4 = new java.sql.Date(date3.getTime());
        System.out.println(date4);

        //get()设置方法
        Calendar calendar = Calendar.getInstance();
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //set()方法
        calendar.set(Calendar.DAY_OF_MONTH,10);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add()在原有的基础上加几天
        calendar.add(Calendar.DAY_OF_MONTH,3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //getTime():日历类-->date
        Date date5 = calendar.getTime();
        System.out.println(date5);

        //setTime():date -->日历类
        Date date6 = new Date();
        calendar.setTime(date6);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //Instant使用
        Instant instant = Instant.now();
        System.out.println(instant);

        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

    }



}
