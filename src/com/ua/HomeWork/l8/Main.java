package com.ua.HomeWork.l8;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int lenght = sc.nextInt();
        int [] arr = new int[lenght];
        fillArray(arr, 20);
        printArray(arr);
        arrayMinMax(arr);
        double average = sumArray(arr) / lenght;
        System.out.println("Average of Array: "+average);
        double sum = sumArray(arr);
        System.out.println("Sum of Array: "+sum);


        }

    static void fillArray (int[] arr, int maxNumber) {
        Random random = new Random();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(maxNumber);
        }
    }

    static void printArray (int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static double sumArray (int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void arrayMinMax (int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);


    }



}
