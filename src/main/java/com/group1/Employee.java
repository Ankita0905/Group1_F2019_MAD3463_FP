package com.group1;

import java.time.LocalDate;

public abstract class Employee
{
    private int id;
    private String name;
    private int age;

    public int calBirthYear()
    {
        return age;

    }

    public abstract int calEarnings();


}