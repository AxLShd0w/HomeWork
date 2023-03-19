package com.ua.HomeWork.l18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Lists {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listOne = new ArrayList<>();
        int listOneSize = listOne.size();
        listOneSize = 10;
        for (int i = 0; i < listOneSize; i++) {
            listOne.add(random.nextInt(100));
        }
        //System.out.println(listOne);

        List<Integer> listTwo = new LinkedList<>();
        int listTwoSize = listTwo.size();
        listTwoSize = 2000000;
        for (int j = 0; j < listTwoSize; j++) {
            listTwo.add(random.nextInt(100));
        }
        //System.out.println(listTwo);
    }
}
