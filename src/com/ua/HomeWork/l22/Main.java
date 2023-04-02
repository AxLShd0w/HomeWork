package com.ua.HomeWork.l22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 5.0));
        students.add(new Student("Petr", 4.3));
        students.add(new Student("Andrey", 3.8));
        students.add(new Student("Nikolay", 4.0));
        students.add(new Student("Marina", 3.5));

        System.out.println("No sorting: " + students);

        Collections.sort(students, (s1, s2) -> Double.compare(s1.getAverageScore(), s2.getAverageScore()));
        System.out.println("Sorting by AverageScore: " + students);

        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Sorting by Name: " + students);
    }
}
