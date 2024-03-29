package com.group1.PEmployee;

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
    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is PartTime / Fixed based");
        System.out.println("- Rate:" + " " + getRate());
        System.out.println("- HoursWorked:" + " " + getHoursWorked());
        System.out.println("- Fixed Amount:" + " " + getFixedAmount());
        System.out.println("- Earnings:" + " " + calculateEarning());
        System.out.println("Employee has no Vehicle");
        System.out.println("**********************************************************************************");


    }



   

}
