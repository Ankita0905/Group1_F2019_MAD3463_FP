package com.group1;

public class CommissionBasedPartTime extends PartTime
{
    private float CommissionPer;

    public CommissionBasedPartTime(String name, int age, float rate, int hoursWorked, float CommissionPer)
    {
        super(name, age, rate, hoursWorked);
        this.CommissionPer = CommissionPer;
    }
}