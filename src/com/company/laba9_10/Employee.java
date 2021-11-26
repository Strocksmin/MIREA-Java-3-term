package com.company.laba9_10;

public class Employee {
    private String name, lastName;
    private double salary;
    public EmployeePosition position;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }
}
