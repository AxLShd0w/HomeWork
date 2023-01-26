package com.ua.HomeWork.l5;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();

        if (a > b){
            System.out.println("Number A is bigger than Number B");
        } else if (a == b){
            System.out.println("The Numbers is equal");
        } else {
            System.out.println("Number B is bigger than Number A");
        }
    }
}
