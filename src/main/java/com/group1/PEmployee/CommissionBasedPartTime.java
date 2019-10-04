package com.group1.PEmployee;

import com.group1.Vehicle.Motorcycle;

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
        System.out.println("- Rate:" + " " + getRate());
        System.out.println("- HoursWorked:" + " " + getHoursWorked());
        System.out.println("- Commission:" + " " + getCommissionPer()+"%");
        System.out.println("- Earnings:" + " " + calculateEarning());
        Motorcycle m2=new Motorcycle("BMW","RR-1000",2018,"Sandy25","Motorcycle");
        m2.printMyData();
        System.out.println("**********************************************************************************");
    }

}