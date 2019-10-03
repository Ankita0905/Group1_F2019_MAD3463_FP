package com.group1;

public class FixedBasedPartTime extends PartTime
{
    private float fixedAmount;
    private float getFixedAmount()
    {
        return fixedAmount;
    }
    private void setFixedAmount(float fixedAmount)
    {
        this.fixedAmount = fixedAmount;
    }
    public FixedBasedPartTime(String name, int age, float rate, int hoursWorked, float fixedAmount)
    {
        super(name, age, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }
    @Override
    public float calculateEarning()
    {
        return (getRate() * getHoursWorked() + getFixedAmount());
    }


   

}
