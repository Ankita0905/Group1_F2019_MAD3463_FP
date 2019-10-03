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
    @Override
    public float calculateEarning()
    {
        return calculateCommission();
    }

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is PartTime / Commissioned");
        System.out.println("Rate:" + " " + getRate());
        System.out.println("HoursWorked:" + " " + getHoursWorked());
        System.out.println("Commission:" + " " + getCommissionPer()+"%");
        System.out.println("Earnings:" + " " + calculateEarning());
    }

}