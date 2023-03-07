package com.ua.HomeWork.l15;

public interface Drive {

    String DEFAULT_TYPE = "Driver";

    void canDrive();
    default void sayDriverName () {
        System.out.print("I'm "+ DEFAULT_TYPE+" ");
    }


}
