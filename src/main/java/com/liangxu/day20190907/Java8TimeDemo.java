package com.liangxu.day20190907;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Java8TimeDemo {
    public static void main(String[] args) {
//        Instant：时间戳
//        Duration：持续时间，时间差
//        LocalDate：只包含日期，比如：2016-10-20
//        LocalTime：只包含时间，比如：23:12:10
//        LocalDateTime：包含日期和时间，比如：2016-10-20 23:14:21
//        Period：时间段
//        ZoneOffset：时区偏移量，比如：+8:00
//        ZonedDateTime：带时区的时间
//        Clock：时钟，比如获取目前美国纽约的时间

//        DateTimeFormatter：时间格式化


//        LocalDate todayDate = LocalDate.now();

//        System.out.println("今天的日期：" + todayDate);
//        //结果  2019-09-07


        //取2016年10月的第1天
//        LocalDate firstDay = todayDate.with(TemporalAdjusters.firstDayOfMonth());
//        System.out.println(firstDay);

        //取2016年10月的第1天，另外一种写法
//        LocalDate firstDay2 = todayDate.withDayOfMonth(1);
//        System.out.println(firstDay2);

        //取2016年10月的最后1天，不用考虑大月，小月，平年，闰年
//        LocalDate lastDay = todayDate.with(TemporalAdjusters.lastDayOfMonth());
//        System.out.println(lastDay);

        //当前日期＋1天
//        LocalDate tomorrow = todayDate.plusDays(1);
//        System.out.println(tomorrow);

        //判断是否为闰年
//        boolean isLeapYear = tomorrow.isLeapYear();
//        System.out.println(isLeapYear);


//        LocalDate birthday = LocalDate.of(1990, 10, 12);
//        MonthDay birthdayMd = MonthDay.of(birthday.getMonth(), birthday.getDayOfMonth());
//        MonthDay today = MonthDay.from(LocalDate.of(2016, 10, 12));
//        System.out.println(today.equals(birthdayMd));


//获取当前的时间
        LocalTime nowTime = LocalTime.now(); //结果14:29:40.558
//        System.out.println("nowTime = " + nowTime);

//如果不想显示毫秒
        LocalTime nowTime2 = LocalTime.now().withNano(0); //14:43:14
//        System.out.println("nowTime2 = " + nowTime2);
//指定时间
        LocalTime time = LocalTime.of(14, 10, 21); //14:10:21
//        System.out.println("time = " + time);
        LocalTime time2 = LocalTime.parse("12:00:01"); // 12:00:01
//        System.out.println("time2 = " + time2);


//当前时间增加2小时
        LocalTime nowTimePlus2Hour = nowTime.plusHours(2); //16:47:23.144
//        System.out.println("nowTimePlus2Hour = " + nowTimePlus2Hour);
//或者
        LocalTime nowTimePlus2Hour2 = nowTime.plus(2, ChronoUnit.HOURS);
//        System.out.println("nowTimePlus2Hour2 = " + nowTimePlus2Hour2);


//        LocalDate today = LocalDate.now();
//        LocalDate specifyDate = LocalDate.of(2015, 10, 20);
//        System.out.println(today.isAfter(specifyDate)); //true

        //查看当前的时区
        ZoneId defaultZone = ZoneId.systemDefault();
//        System.out.println(defaultZone); //Asia/Shanghai

//查看美国纽约当前的时间
        ZoneId america = ZoneId.of("America/New_York");
       /* LocalDateTime shanghaiTime = LocalDateTime.now();
        LocalDateTime americaDateTime = LocalDateTime.now(america);
        System.out.println(shanghaiTime); //2016-11-06T15:20:27.996
        System.out.println(americaDateTime); //2016-11-06T02:20:27.996 ，可以看到美国与北京时间差了13小时*/

//带有时区的时间
        ZonedDateTime americaZoneDateTime = ZonedDateTime.now(america);
//        System.out.println(americaZoneDateTime); //2016-11-06T02:23:44.863-05:00[America/New_York]


//        LocalDate today = LocalDate.now();
//        LocalDate specifyDate = LocalDate.of(2019, 6, 7);
//        Period period = Period.between(specifyDate, today);
//
//        System.out.println(period.getDays());  //0
//        System.out.println(period.getMonths()); //3
//        System.out.println(specifyDate.until(today, ChronoUnit.DAYS)); //92

//        String specifyDate = "20151011";
//        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
//        LocalDate formatted = LocalDate.parse(specifyDate,formatter);
//        System.out.println(formatted);

//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("YYYY MM dd");
//        System.out.println(formatter2.format(LocalDate.now()));

        //Date与Instant的相互转化
        Instant instant = Instant.now();
//        System.out.println("instant = " + instant);
        Date date = Date.from(instant);
        Instant instant2 = date.toInstant();
//
////Date转为LocalDateTime
//        Date date2 = new Date();
//        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(date2.toInstant(), ZoneId.systemDefault());
//
////LocalDateTime转Date
//        LocalDateTime localDateTime3 = LocalDateTime.now();
//        Instant instant3 = localDateTime3.atZone(ZoneId.systemDefault()).toInstant();
//        Date date3 = Date.from(instant);
//
////LocalDate转Date
////因为LocalDate不包含时间，所以转Date时，会默认转为当天的起始时间，00:00:00
//        LocalDate localDate4 = LocalDate.now();
//        Instant instant4 = localDate4.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
//        Date date4 = Date.from(instant);


    }
}
