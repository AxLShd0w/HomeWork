package com.ua.HomeWork.l6;

public class Faktorial {

    public static void main(String[] args) {

        int fakt = 1;
        int number = 7;
        for (int i = 1; i <= number; i++) {
            fakt = fakt * i;
        }
        System.out.println("Faktorlial of " + number + " is: " + fakt);
    }
}
