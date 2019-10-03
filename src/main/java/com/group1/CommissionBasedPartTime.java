package com.group1;

public class CommissionBasedPartTime extends PartTime
{
    private float CommissionPer;

    public CommissionBasedPartTime(String name, int age, float rate, int hoursWorked, float CommissionPer)
    {
        super(name, age, rate, hoursWorked);
        this.CommissionPer = CommissionPer;
    }
    private float getCommissionPer()
    {
        return CommissionPer;
    }
    private void setCommission(float CommissionPer)
    {
        CommissionPer = CommissionPer;
    }
    private float calculateHours()
    {
        return getRate() * getHoursWorked();
    }

    private float calculateCommission()
    {
        float calculateHours = calculateHours();
        return (calculateHours + ((calculateHours * getCommissionPer()) / 100));
    }


}