package com.company.laba9_10;

import java.util.*;

public class Company {
    private static int companyMembers;
    private double income = 0;
    private double companySalary = 0;
    public static List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee, String position) {
        if (position.equals("Менеджер")) {
            Manager manager = new Manager();
            Employee emp = new Employee(manager.calcSalary());
            employees.add(emp);
            income = income + emp.getSalary();
            companySalary = companySalary + manager.getCompanySalary();
        }
        if (position.equals("Оператор")) {
            Employee emp = new Employee(new Operator().calcSalary());
            employees.add(emp);
            income = income + emp.getSalary();
        }
        if (position.equals("Топ-Менеджер")) {
            if (income > 1000000) employees.add(new Employee(new TopManager().calcSalary() * 1.5));
            else employees.add(new Employee(new TopManager().calcSalary()));
        }
        companyMembers++;
    }

    public void hireAll(Employee employee, String position, int count) {
        for (int i = 0; i < count; i++) {
            hire(employee, position);
        }
    }

    public void fire(int index) {
        employees.remove(index);
        companyMembers--;
    }

    public double getIncome() {
        return companySalary;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count > employees.size() || count < 0) count = 5;
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() > o2.getSalary() ? -1
                        : o1.getSalary() < o2.getSalary() ? 1
                        : 0;
            }
        });
        return employees.subList(0, count);
    }

    public List<Employee> getDownSalaryStaff(int count) {

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() < o2.getSalary() ? -1
                        : o1.getSalary() > o2.getSalary() ? 1
                        : 0;
            }
        });
        return employees.subList(0, count);
    }
}
