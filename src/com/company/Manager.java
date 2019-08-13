package com.company;

public class Manager extends Employee {

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    private double Bonus;

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary+getBonus();
    }

    public  Manager(String aName,double aslary,int year,int month,int day,double aBonus)
    {
        super(aName,aslary,year,month,day);
        Bonus = aBonus;
    }
}
