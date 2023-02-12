package com.ua.HomeWork.l10;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.age = 21;
        student.course = 3;
        student.name = "Alex";
        student.averageScore = 90;
        student.gender = "Male";
        student.groupNumber = "K-310";
        student.study();

        Teacher teacher = new Teacher();
        teacher.discipline = "OOP";
        teacher.groupNumber = "K-310";
        teacher.name = "Ivan Mykytovych";
        teacher.jobTitle = "Professor";
        teacher.numberOfStudents = 1;
        teacher.teach();

        Arrays array = new Arrays();
        array.maxNumber = 20;
        array.arrCreate();
        array.fillArray();
        array.printArray();
        array.sortArray();
    }
}
