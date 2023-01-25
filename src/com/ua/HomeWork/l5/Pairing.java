package com.ua.HomeWork.l5;

import java.util.Scanner;

public class Pairing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();

        if (A %2 == 0 && B %2 == 0){
            System.out.println("Numbers are paired");
        } else if (A %2 == 0 && B %2 != 0){
            System.out.println("Unpaired numbers. Only A is paired");
            } else if (A %2 != 0 && B %2 == 0){
                System.out.println("Unpaired numbers. Only B is paired");
                } else {
                    System.out.println("Unpaired numbers");
        }
            }
        }

