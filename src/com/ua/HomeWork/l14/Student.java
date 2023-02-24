package com.ua.HomeWork.l14;
import java.util.Scanner;

public class Student extends Human {

    String name;
    int age;
    String groupNumber;
    int course;
    int averageScore;
    String curatorName;
    String gender;

    @Override
    public void getGender() {
        System.out.println("Student gender: " + gender);
    }



}
