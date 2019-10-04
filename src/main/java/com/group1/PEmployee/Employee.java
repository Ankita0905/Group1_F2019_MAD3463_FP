package com.group1.PEmployee;

import com.group1.IPrintable;

import java.time.LocalDate;

public abstract class Employee implements IPrintable {
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

    private int calculateBirthYear()
    {
        return LocalDate.now().getYear() - getAge();
    }

    public int getBirthYear()
    {
        return calculateBirthYear();
    }

    public abstract float calculateEarning();

    public abstract void printMyData();

   // Car c1=new Car("honda","Model1", 2015,"ABC123","car");
   // Motorcycle m1=new Motorcycle("Hero", "CBR", 2010,"EFG234", "Motorcycle");
}