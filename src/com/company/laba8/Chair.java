package com.company.laba8;

public class Chair extends Furniture {
    private String material;

    public Chair(double height, double width, double depth, int price, String name, String material) {
        super(height, width, depth, price, 4, name);
        this.material = material;
    }

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material + '\'' +
                "} " + super.toString();
    }
}
