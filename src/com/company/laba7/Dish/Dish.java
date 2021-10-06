package com.company.laba7.Dish;

abstract public class Dish {
    protected String material, color;

    public String getMaterial() {
        return material;
    }

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double getVolume();
}
