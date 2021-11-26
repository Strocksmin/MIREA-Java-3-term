package com.company.laba9_10;

import java.util.Random;

public class Manager implements EmployeePosition {
    private final double fixSalary = 30000;
    private double companySalary;
    private String position = "Менеджер";

    public double getCompanySalary() {
        return companySalary;
    }

    public Manager() {
        calcSalary();
    }

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary() {
        Random r = new Random();
        this.companySalary = 85000 + (r.nextDouble() * 30000);
        return fixSalary + companySalary * 1.05;
    }

    @Override
    public String toString() {
        return position + "\t" + calcSalary();
    }
}
