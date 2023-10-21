package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getWeeksInWeekYear());
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2032));


        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//
//
//        LocalTime lt = LocalTime.now();
//        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
