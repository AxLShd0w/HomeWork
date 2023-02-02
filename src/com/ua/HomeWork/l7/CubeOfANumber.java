package com.ua.HomeWork.l7;

import java.util.Scanner;

public class CubeOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter any number: ");
        int number = sc.nextInt();
        int cube = cubeOfNumber(number);
        System.out.println("The Cube of a given Number " + number + " = " + cube);
    }

    static int cubeOfNumber(int a) {
        int b = a * a * a;
        return b;
    }
}
