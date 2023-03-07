package com.ua.HomeWork.l15;

public interface Fly {

    String DEFAULT_TYPE = "Pilot";

    void canFly();
    default void sayPilotName () {
        System.out.print("I'm "+ DEFAULT_TYPE+" ");
    }



}
