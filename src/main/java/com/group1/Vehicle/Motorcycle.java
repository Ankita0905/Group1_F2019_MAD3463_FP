package com.group1.Vehicle;

public class Motorcycle extends Vehicle
{
    public Motorcycle(String make, String model, int year, String plateNum, String typeOfVehicle) {
        super(make, model, year, plateNum, typeOfVehicle);
    }
    @Override
    public void printMyData()
    {
        System.out.println("make: " +getMake());
        System.out.println("model: " +getModel());
        System.out.println("Year: " +getYear());
        System.out.println("Plate Number: " +getPlateNum());
        System.out.println("Employee has a: " +getTypeOfVehicle());
    }
}
