package com.group1.PEmployee;

import com.group1.Vehicle.Car;

public class Intern extends Employee
{

    private String schoolName;

    private String getSchoolName()
    {
        return schoolName;
    }

    private void setSchoolName(String schoolName)
    {
        this.schoolName = schoolName;
    }

    public Intern(String name, int age, String schoolName)
    {
        super(name, age);
        this.schoolName = schoolName;
    }
    @Override
    public float calculateEarning()
    {
        return Earning;
    }
    @Override
    public void printMyData()
    {

        System.out.println("Name:" + " " + getName());
        System.out.println("Year of Birth:" + " " + getBirthYear());
        System.out.println("Employee is Intern");
        System.out.println("- SchoolName:" + " " + getSchoolName());
        System.out.println("- Earnings:" + " " + calculateEarning());
        Car a1=new Car("Ferrari","488 Spider",2017,"Ankita123","Car");
        a1.printMyData();
        System.out.println("**********************************************************************************");
    }
}

