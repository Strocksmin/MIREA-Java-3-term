package com.company.laba9_10;

public class Operator implements EmployeePosition {
    private final double fixSalary = 15000;
    private String position = "Оператор";

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary() {
        return fixSalary;
    }

    @Override
    public String toString() {
        return position + "\t" + calcSalary();
    }
}
