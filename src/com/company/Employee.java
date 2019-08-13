package com.company;

import com.sun.javafx.runtime.SystemProperties;
import sun.awt.Symbol;

import java.time.LocalDate;

public class Employee {

    private String Name;
    private double Salary;
    private LocalDate Hireday;


    public Employee()
    {

    }

    public void setName(String name) {
        Name = name;
    }

    public Employee(String name, Double salary, int year, int month, int day)
    {


        Name = name;
        Salary = salary;
        Hireday = LocalDate.of(year,month,day);
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }

    public LocalDate getHireday() {
        return Hireday;
    }

    public void setHireday(LocalDate date)
    {
        Hireday = date;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void raiseSalary(Double Bypercent)
    {

        double raise = (Salary*Bypercent)/100;
        Salary = Salary+raise;
    }

    public static void checkStaticBehaviour(Employee e)
    {
        e.raiseSalary((double) 10);
    }
}
