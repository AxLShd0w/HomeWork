package com.ua.HomeWork.l11;

public class PassengerCar extends Car{

    protected int numberOfPassengers;
    protected String carType;

    public int getNumberOfPassengers() {

        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {

        this.numberOfPassengers = numberOfPassengers;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
    @Override
    public String toString() {
        return "PassengerCar{" +
                "carType='" + carType + '\'' +
                '}';
    }
}
