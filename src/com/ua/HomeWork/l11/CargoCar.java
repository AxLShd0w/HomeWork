package com.ua.HomeWork.l11;

public class CargoCar extends Car{

    protected int axisNumber;
    protected String modelOfTrailer;
    private String carType;

    public int getAxisNumber() {

        return axisNumber;
    }

    public void setAxisNumber(int axisNumber) {

        this.axisNumber = axisNumber;
    }

    public String getModelOfTrailer() {

        return modelOfTrailer;
    }

    public void setModelOfTrailer(String modelOfTrailer) {

        this.modelOfTrailer = modelOfTrailer;
    }

    @Override
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "CargoCar{" +
                "carType='" + carType + '\'' +
                '}';
    }
}
