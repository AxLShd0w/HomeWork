package com.ua.HomeWork.l7;

import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter any number: ");
        int count = sc.nextInt();
        printSomeStars(count);
    }

    static void printSomeStars(int number){
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
