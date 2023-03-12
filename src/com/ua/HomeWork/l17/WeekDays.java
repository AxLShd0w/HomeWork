package com.ua.HomeWork.l17;

import java.sql.SQLOutput;
import java.util.Scanner;
public enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    static int day;
    public static void getDaysOfWeek(int day){
        if (day == 1){
            System.out.print(WeekDays.MONDAY);
        } else if (day == 2) {
            System.out.print(WeekDays.TUESDAY);
        } else if (day == 3) {
            System.out.print(WeekDays.WEDNESDAY);
        } else if (day == 4) {
            System.out.print(WeekDays.THURSDAY);
        } else if (day == 5) {
            System.out.print(WeekDays.FRIDAY);
        } else if (day == 6) {
            System.out.print(WeekDays.SATURDAY);
        } else if (day == 7) {
            System.out.print(WeekDays.SUNDAY);
        }
        }
}

