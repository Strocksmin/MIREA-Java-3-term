package com.company.laba7.Dish;

public class SoupDish extends Dish {
    protected double height, radius;

    public SoupDish(String material, String color, double height, double radius) {
        super(material, color);
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "SoupDish{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", radius=" + radius +
                '}';
    }

    @Override
    double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    void makeSoup() {
        System.out.println("Суп сварен");
    }
}
