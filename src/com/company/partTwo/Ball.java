package com.company.partTwo;

class Main {

    public static void main(String[] args) {
        Ball b = new Ball(15, "volleyball");
        System.out.println(b.getRadius());
        /// <----------------------------> ///
        System.out.println("\nТестирование класса Book:");
        Book book = new Book("11/22/63", "Stiven King", "Romance");
        System.out.println(book);
    }
}

public class Ball {
    private int radius;
    private String type;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ball() {
        radius = 10;
        type = "football";
    }

    public Ball(int r, String t) {
        radius = r;
        type = t;
    }

    public double getVolume()
    {
        return ((double)4/3 * Math.PI * Math.pow(radius, 3));
    }
}
