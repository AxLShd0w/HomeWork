package com.ua.HomeWork.l10;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    int[] arr;
    int arrSize;
    int maxNumber;

    void arrCreate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        arrSize = sc.nextInt();
        arr = new int[arrSize];
    }

    void fillArray() {
        Random random = new Random();
        for (int i = 0; i < arrSize; i++) {
            arr[i] = random.nextInt(maxNumber);
        }
    }

    void printArray() {
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void sortArray() {
        int i;
        for (i = 0; i < arrSize; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
        for (int k = 0; k < arrSize; k++) {
            for (int m = k + 1; m < arrSize; m++) {
                int tmp = 0;
                if (arr[k] < arr[m]) {
                    tmp = arr[k];
                    arr[k] = arr[m];
                    arr[m] = tmp;
                }
            }
            System.out.print(arr[k] + " ");
        }
    }
}
