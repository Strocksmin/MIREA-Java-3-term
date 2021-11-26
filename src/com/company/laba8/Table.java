package com.company.laba8;

public class Table extends Furniture {
    private String material;

    public Table(double height, double width, double depth, int price, int legcount, String name, String material) {
        super(height, width, depth, price, legcount, name);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material + '\'' +
                "} " + super.toString();
    }
}
