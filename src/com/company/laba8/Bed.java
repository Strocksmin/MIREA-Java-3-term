package com.company.laba8;

public class Bed extends Furniture {
    private int personCount;
    private String material;

    public Bed(double height, double width, double depth, int price, String name, int personCount, String material) {
        super(height, width, depth, price, 4, name);
        this.personCount = personCount;
        this.material = material;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPersonCount() {
        return personCount;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public String toString() {
        return "Bed{" +
                "personCount=" + personCount +
                ", material='" + material + '\'' +
                "} " + super.toString();
    }
}
