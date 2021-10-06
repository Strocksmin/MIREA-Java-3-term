package com.company.laba7.Dish;

public class DessertDish extends Dish {
    protected double radius;
    protected double height = 1;

    public DessertDish(String material, String color, double radius) {
        super(material, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "DessertDish{" +
                "radius=" + radius +
                ", height=" + height +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    double getVolume() {
        System.out.println(Math.pow(radius, 2));
        return Math.PI * Math.pow(radius, 2);
    }
}
