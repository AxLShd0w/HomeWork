package com.ua.HomeWork.l15;

public class Human implements Drive, Fly {

    String name;
    int age;
    String gender;

    @Override
    public void canDrive() {
        sayDriverName();
        System.out.println("I can Drive! " );

    }

    @Override
    public void canFly() {
        sayPilotName();
        System.out.print("I can Fly!!!");
    }
}
