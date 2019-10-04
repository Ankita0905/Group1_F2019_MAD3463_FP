package com.group1.Vehicle;

public class Car extends Vehicle
{
    private String color="Black";
    private int noOfSeats=4;
    private int maxSpeed=350;
    public Car(String make, String model, int year, String plateNum, String typeOfVehicle) {
        super(make, model, year, plateNum, typeOfVehicle);
    }
    public String getColor() {
        return color;
    }
    public int getNoOfSeats() {
        return noOfSeats;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }


    @Override
    public void printMyData() {

    }
}
