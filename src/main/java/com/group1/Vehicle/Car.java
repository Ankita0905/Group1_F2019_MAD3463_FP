package com.group1.Vehicle;

public class Car extends Vehicle
{
    private String color;
    private int noOfSeats;
    private int maxSpeed;
    public Car(String make, String model, int year, String plateNum, String typeOfVehicle) {
        super(make, model, year, plateNum, typeOfVehicle);
    }
    public String getColor() {
        return color;
    }

    @Override
    public void printMyData() {

    }
}
