package com.ua.HomeWork.l4;

public class Main {

    public static void main(String[] args) {
        String str = "CyberSecurity";
        int lenght = str.length();
        int LastIndex = lenght - 1;

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println((str.substring(0,1) + (str.substring(LastIndex))));
    }
}
