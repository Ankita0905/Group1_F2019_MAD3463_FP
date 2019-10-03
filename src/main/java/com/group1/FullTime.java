package com.group1;

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
}
