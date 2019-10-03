package com.group1;

public class Intern extends Employee
{

    private String schoolName;

    private String getSchoolName()
    {
        return schoolName;
    }

    private void setSchoolName(String schoolName)
    {
        this.schoolName = schoolName;
    }

    public Intern(String name, int age, String schoolName)
    {
        super(name, age);
        this.schoolName = schoolName;
    }
    @Override
    public float calculateEarning()
    {
        return Earning;
    }
    @Override
    public void printMyData()
    {
        System.out.println("Name:" + " " + getName());

    }
}

