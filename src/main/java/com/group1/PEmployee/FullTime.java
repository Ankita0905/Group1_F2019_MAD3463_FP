package com.group1.PEmployee;

import com.group1.Vehicle.Car;
import com.group1.Vehicle.Motorcycle;

public class FullTime extends Employee
{
    private float salary;
    private float bonus;

    private float getSalary()
    {
        return salary;
    }

    private float getBonus()
    {
        return bonus;
    }
    private void setBonus(float bonus)
    {
        this.bonus = bonus;
    }
    public FullTime(String name, int age, float salary, float bonus)
    {
        super(name, age);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public float calculateEarning()
            
    {
        return getSalary() + getBonus();
    }


    @Override
    public void printMyData() {

        System.out.println("Name:" + " " + getName());
        System.out.println("Year of Birth:" + " " + getBirthYear());
        System.out.println("Employee is Full Time");
        System.out.println("- Salary : " + getSalary());
        System.out.println("- Bonus : " + getBonus());
        System.out.println("- Earnings : " + calculateEarning());
        Car a=new Car("Lamborghini","Aventador SV",2018,"Kay1811","Car");
        a.printMyData();
        System.out.println("**********************************************************************************");

    }

}
