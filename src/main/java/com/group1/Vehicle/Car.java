package com.group1.Vehicle;

public class Car extends Vehicle
{


    public Car(String make, String model, int year, String plateNum, String typeOfVehicle) {
        super(make, model, year, plateNum, typeOfVehicle);
    }


    @Override
    public void printMyData()
    {
        System.out.println("make: " +getMake());
        System.out.println("model: " +getModel());
        System.out.println("Year: " +getYear());
        System.out.println("Plate Number: " +getPlateNum());
        System.out.println("TYPE: " +getTypeOfVehicle());
    }
}
