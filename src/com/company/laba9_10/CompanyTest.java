package com.company.laba9_10;

import java.util.List;

public class CompanyTest {
    public static void main(String[] args) {
        Manager m = new Manager();

        Company company = new Company();

        company.hireAll(new Employee(), "Оператор", 180);
        company.hireAll(new Employee(), "Менеджер", 80);
        company.hireAll(new Employee(), "Топ-Менеджер", 10);

        System.out.println(company.getIncome());
        List<Employee> list = company.getTopSalaryStaff(15);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(Math.round(list.get(i).getSalary()) + " руб");
        }

        System.out.println("__________________");

        List<Employee> list2 = company.getDownSalaryStaff(30);

        for(int i = 0; i < list2.size(); i++) {
            System.out.println(Math.round(list2.get(i).getSalary()) + " руб");
        }

        for(int i = 0; i < 135; i++) {
            company.fire(i);
        }

        System.out.println("__________________");

        List<Employee> list3 = company.getTopSalaryStaff(10);

        for(int i = 0; i < list3.size(); i++) {
            System.out.println(Math.round(list3.get(i).getSalary()) + " руб");
        }

        System.out.println("__________________");

        List<Employee> list4 = company.getDownSalaryStaff(30);

        for(int i = 0; i < list4.size(); i++) {
            System.out.println(Math.round(list4.get(i).getSalary()) + " руб");
        }
    }
}
