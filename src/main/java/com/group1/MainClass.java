package com.group1;

import com.group1.PEmployee.CommissionBasedPartTime;
import com.group1.PEmployee.FixedBasedPartTime;
import com.group1.PEmployee.FullTime;
import com.group1.PEmployee.Intern;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class MainClass
{
    public static void main(String[] args) throws FileNotFoundException {

        //PrintStream fileOut = new PrintStream("./out.txt");
        //System.setOut(fileOut);
        Intern i1 = new Intern("Ankita",  24, "Lambton College");
        i1.printMyData();
        //Car a1=new Car("Ferrari","488 Spider",2017,"Ankita123","Car");
        //a1.printMyData();
        //Intern i2=new Intern("Karan", 23,"Lambton College");
        //i2.printMyData();
        //Car a=new Car("Lamborghini","Aventador SV",2018,"Kay1811","Car");
        //a.printMyData();
        CommissionBasedPartTime c1 = new CommissionBasedPartTime("Sandeep", 22, 20.0f, 20, 10.0f);
        c1.printMyData();
        //Motorcycle m2=new Motorcycle("BMW","RR-1000",2018,"Sandy25","Motorcycle");
        //m2.printMyData();
        FixedBasedPartTime f1 = new FixedBasedPartTime("Kamal", 25, 20.0f, 15, 30.0f);
        f1.printMyData();
        FullTime ft1=new FullTime("Karan", 23, 1500f, 200f);
        ft1.printMyData();
        //Motorcycle m1=new Motorcycle("Hero", "CBR", 2010,"EFG234", "Motorcycle");
        //m1.printMyData();
        float totalPayroll=i1.calculateEarning()+c1.calculateEarning()+f1.calculateEarning()+ft1.calculateEarning();
        System.out.println("Total Payroll: " + totalPayroll+" Canadian Dollars");


    }
}
