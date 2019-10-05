package com.group1.PEmployee;

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
    private void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    public PartTime(String name, int age, float rate, int hoursWorked)
    {
        super(name, age);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public void printMyData() {

        System.out.println("Name:" + " " + getName());
        System.out.println("Year of Birth:" + " " + getBirthYear());

    }
}
