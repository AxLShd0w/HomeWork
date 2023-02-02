package com.ua.HomeWork.l7;

import java.util.Scanner;

public class Symbol {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter any symbol: ");
            String str = sc.nextLine();
            System.out.print("Please Enter any number: ");
            int count = sc.nextInt();
            printSomeStars(count, str);
        }

        static void printSomeStars(int number, String symbol){
            for (int i = 0; i < number; i++) {
                System.out.print(symbol + " ");
            }
            System.out.println();


        }


}