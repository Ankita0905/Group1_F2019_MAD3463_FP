package com.group1;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private int age;
    float Earning = 1000.0f;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    private void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    private void setAge(int age)
    {
        this.age = age;
    }

    private int calculateBirthYear() {
        return LocalDate.now().getYear() - getAge();
    }

    public abstract float calculateEarning();

    public abstract void printMyData();
}