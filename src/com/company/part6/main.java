package com.company.part6;

public class main {
    public static void main(String[] args) {
        MovablePointRectangle points = new MovablePointRectangle(2,3,-2,-3,1,2,1,2);
        System.out.println(points);
        System.out.println(points.getArea());
        System.out.println(points.length);
        points.points.checkSpeed();
        points.moveRight();
        System.out.println(points);
        // Тест MovableRectangle
        MovableRectangle rectangle = new MovableRectangle(4,6, 2,4, 1,3);
        System.out.println(rectangle);
        rectangle.moveLeft();
        System.out.println(rectangle);
    }
}
