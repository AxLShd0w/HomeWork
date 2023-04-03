package com.ua.HomeWork.l23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumbersList {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(10));
        }
        System.out.println("List : " + numbers);

        Integer sum  = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of elements : " + sum);
    }
}
