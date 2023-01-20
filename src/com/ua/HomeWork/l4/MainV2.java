package com.ua.HomeWork.l4;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слово: ");
        String fromInput = scanner.nextLine();
        int lenght = fromInput.length();
        int lastIndex = lenght - 1;
        System.out.println(fromInput.toLowerCase());
        System.out.println(fromInput.toUpperCase());
        System.out.println((fromInput.substring(0,1)) + (fromInput.substring(lastIndex)));
    }
}