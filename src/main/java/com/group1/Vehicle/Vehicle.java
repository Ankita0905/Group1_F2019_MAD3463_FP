package com.group1.Vehicle;

import com.group1.IPrintable;

public class Vehicle implements IPrintable

{
    private String make;
    private String model;
    private int year;
    private String plateNum;
    private String typeOfVehicle;
    public Vehicle(String make,String model,int year,String plateNum,String typeOfVehicle)
    {
        this.make = make;
        this.model=model;
        if(year<1900)
        { throw new IllegalArgumentException("too much old");
        }
        this.year=year;
        this.plateNum=plateNum;
        this.typeOfVehicle=typeOfVehicle;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make)
    {
        this.make = make;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)




    @Override
    public void printMyData() {

    }
}
