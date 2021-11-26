package com.company.laba9_10;

import java.util.Random;

public class TopManager  implements EmployeePosition {
    private final double fixSalary = 300000;
    private String position = "Топ-Менеджер";

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
