package com.group1;

public class MainClass
{
    public static void main(String[] args)
    {
        Intern i1 = new Intern("Ankita",  24, "Lambton College");
        i1.printMyData();
        Intern i2=new Intern("Karan", 23,"Lambton College");
        i2.printMyData();
        CommissionBasedPartTime c1 = new CommissionBasedPartTime("Sandeep", 22, 20.0f, 20, 10.0f);
        c1.printMyData();
        FixedBasedPartTime f1 = new FixedBasedPartTime("Kamal", 25, 20.0f, 15, 30.0f);
        f1.printMyData();
        FullTime ft1=new FullTime("Honey", 26, 1500f, 200f);
        ft1.printMyData();


    }
}
