package com.company.laba7.Dish;

public class DinnerDish extends Dish {
    protected double radius;
    protected double height = 3;

    public DinnerDish(String material, String color, double radius) {
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
        return Math.PI * Math.pow(radius, 2);
    }
}
