package com.ua.HomeWork.l6;

import java.sql.SQLOutput;

public class Fibonacci {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, num;
        System.out.print(n1 + " " + n2 + " ");
        while (true) {
            num = n2 + n1;
            System.out.print(num + " ");
            n1 = n2;
            n2 = num;
            num++;
            if (num >= 100) {
                break;
            }
        }
    }
}
