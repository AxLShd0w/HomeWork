package com.ua.HomeWork.l6;


import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Upto number:");
        int n = scanner.nextInt();
        int firstN = 0, secondN = 1;
        System.out.println("Fibonacci Series Upto" + n + ": ");

        while (firstN <=n){
            System.out.print(firstN + ", ");

            int nextN = firstN + secondN;
            firstN = secondN;
            secondN = nextN;
        }
            }
        }

