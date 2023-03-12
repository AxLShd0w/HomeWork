package com.ua.HomeWork.l17;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weekday day number (1-7) : ");
        WeekDays.day = sc.nextInt();
        WeekDays.getDaysOfWeek(WeekDays.day);
        }
}
