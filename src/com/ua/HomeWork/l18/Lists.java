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

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 23, "B-212", 2, 95, "Mr. Been", "Male"));
        students.add(new Student("John", 24, "C-425", 4, 82, "Mrs. Castro", "Male"));
        students.add(new Student("Marta", 21, "F-310", 3, 75, "Mr. Smith", "Female"));
        students.add(new Student("Peter", 19, "A-112", 1, 60, "Mr. Stark", "Male"));
        students.add(new Student("Casandra", 25, "F-310", 3, 100, "Mr. Smith", "Female"));

        System.out.print(students + "");


    }


}
