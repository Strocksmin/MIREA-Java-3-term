package com.company.laba8;

abstract public class Furniture {
    private double height, width, depth;
    private int price, legcount;
    private String name;

    public Furniture(double height, double width, double depth, int price, int legcount, String name) {
        if (height < 1) throw new IllegalArgumentException("Высота не может быть меньше 1");
        this.height = height;
        if (width < 1) throw new IllegalArgumentException("Ширина не может быть меньше 1");
        this.width = width;
        this.depth = depth;
        if (price < 0) this.price = 0;
        else this.price = price;
        if (price < 0) this.legcount = 0;
        else this.legcount = legcount;
        this.name = name;
    }

    public abstract void doSomething();

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", price=" + price +
                ", legcount=" + legcount +
                ", name='" + name + '\'' +
                '}';
    }
}
