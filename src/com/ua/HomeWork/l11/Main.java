package com.ua.HomeWork.l11;

public class Main {

    public static void main(String[] args) {

        CargoCar cc = new CargoCar();
        cc.setCarType("CARGO");
        cc.setModel("SCANIA");
        cc.setColor("WHITE");
        cc.setPower(540);
        cc.setTorque(2600);
        cc.setAxisNumber(6);
        cc.setModelOfTrailer("SHMITZ");

        PassengerCar pc = new PassengerCar();
        pc.setCarType("Passenger");
        pc.setModel("Prius");
        pc.setColor("Red");
        pc.setPower(120);
        pc.setTorque(800);
        pc.setNumberOfPassengers(5);

        System.out.println(cc.getCarType());
        System.out.println(pc.getCarType());






    }


}
