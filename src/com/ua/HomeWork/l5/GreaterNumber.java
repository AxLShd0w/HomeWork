package com.ua.HomeWork.l5;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();

        if (A > B){
            System.out.println("Number A is bigger than Number B");
        } else {
            System.out.println("Number B is bigger than Number A");
        }
    }
}
