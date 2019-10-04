package com.group1.Vehicle;

public class Car extends Vehicle
{


    public Car(String make, String model, int year, String plateNum, String typeOfVehicle) {
        super(make, model, year, plateNum, typeOfVehicle);
    }


    @Override
    public void printMyData()
    {
        System.out.println("Employee has a: " +getTypeOfVehicle());
        System.out.println("- Make: " +getMake());
        System.out.println("- Model: " +getModel());
        System.out.println("- Year: " +getYear());
        System.out.println("- Plate Number: " +getPlateNum());

    }
}
