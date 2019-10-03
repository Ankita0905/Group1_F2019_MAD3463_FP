package com.group1;

public abstract class PartTime extends Employee
{
    private float rate;
    private int hoursWorked;
    public float getRate()
    {
        return rate;
    }
    private void setRate(float rate)
    {
        this.rate = rate;
    }
    public int getHoursWorked()
    {
        return hoursWorked;
    }
}
