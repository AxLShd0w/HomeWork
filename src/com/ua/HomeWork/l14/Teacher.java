package com.ua.HomeWork.l14;

public class Teacher extends Human {

    String name;
    String jobTitle;
    String groupNumber;
    int numberOfStudents;
    String discipline;
    String gender;
    int age;

    @Override
    public void getGender() {
        System.out.println("Teacher gender: " + gender);
    }



}
