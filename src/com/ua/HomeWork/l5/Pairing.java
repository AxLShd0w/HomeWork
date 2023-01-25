package com.ua.HomeWork.l5;

import java.util.Scanner;

public class Pairing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();

        if (a %2 == 0 && b %2 == 0){
            System.out.println("Numbers are paired");
        } else if (a %2 == 0 && b %2 != 0){
            System.out.println("Unpaired numbers. Only A is paired");
            } else if (a %2 != 0 && b %2 == 0){
                System.out.println("Unpaired numbers. Only B is paired");
                } else {
                    System.out.println("Unpaired numbers");
        }
            }
        }

