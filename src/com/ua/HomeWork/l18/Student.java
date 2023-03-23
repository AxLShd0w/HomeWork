package com.ua.HomeWork.l18;

public class Student {

        String name;
        int age;
        String groupNumber;
        int course;
        int averageScore;
        String curatorName;
        String gender;

        public Student(String name, int age, String groupNumber, int course, int averageScore, String curatorName, String gender) {
                this.name = name;
                this.age = age;
                this.groupNumber = groupNumber;
                this.course = course;
                this.averageScore = averageScore;
                this.curatorName = curatorName;
                this.gender = gender;
        }

        @Override
        public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", groupNumber='" + groupNumber + '\'' +
                        ", course=" + course +
                        ", averageScore=" + averageScore +
                        ", curatorName='" + curatorName + '\'' +
                        ", gender='" + gender + '\'' +
                        '}';
        }
}

