package com.company;

import java.util.Date;
import java.util.SortedMap;

public class date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);   // Shows total years passed after 1970
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);       // Shows current date, time and year
        System.out.println("Today's date and time is: "+d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
    }
}
