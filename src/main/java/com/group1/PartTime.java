package com.group1;

public abstract class PartTime extends Employee
{
    private int rate;
    private int hoursWorked;
    private float fixedAmount;

    public PartTime(String name, int age)
    {
        super(name, age);
    }
}
