package com.liangxu.java8time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

public class Java8Time {
    public static void main(String[] args) {
//        Clock clock = Clock.systemDefaultZone();
//        long millis = clock.millis();
//        System.out.println("millis = " + millis);  //millis = 1576067751153
//
//        Instant instant = clock.instant();
//        System.out.println("instant = " + instant); //instant = 2019-12-11T12:36:31.358Z
//
//        Date date = Date.from(instant);
//
//        System.out.println("date = " + date);
//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        System.out.println("availableZoneIds = " + availableZoneIds);
//
//        ZoneId zoneId1 = ZoneId.of("Asia/Aden");
//        ZoneId zoneId2 = ZoneId.of("Etc/GMT+9");
//        System.out.println(zoneId2.getRules());
//        System.out.println(zoneId1.getRules());
//
//        LocalTime now1 = LocalTime.now(zoneId1);
//        LocalTime now2 = LocalTime.now(zoneId2);
//
//        System.out.println(now1.isBefore(now2));
//
//
//        long hoursBetween  = ChronoUnit.HOURS.between(now1, now2);
//        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);
//
//        System.out.println("hoursBetween = " + hoursBetween);
//        System.out.println("minutesBetween = " + minutesBetween);


//        LocalTime localTime = LocalTime.of(20, 58, 33);
//        System.out.println("localTime = " + localTime);
//
//        DateTimeFormatter germanFormatter =
//                DateTimeFormatter
//                        .ofLocalizedTime(FormatStyle.SHORT)
//                        .withLocale(Locale.GERMAN);
//
//        LocalTime leetTime = LocalTime.parse("20:37", germanFormatter);
//        System.out.println(leetTime);

        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalDate tomorrow  = today.plus(1, ChronoUnit.DAYS);
        System.out.println("tomorrow  = " + tomorrow );

        LocalDate yesterday  = tomorrow.minusDays(2);
        System.out.println("yesterday = " + yesterday);

        LocalDate independenceDay  = LocalDate.of(2019, Month.DECEMBER, 11);
        DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);




    }

}
