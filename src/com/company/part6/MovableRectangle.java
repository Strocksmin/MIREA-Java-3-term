package com.company.part6;

public class MovableRectangle extends Rectangle implements Movable {

    private double x;
    private double y;
    private int ySpeed;
    private int xSpeed;

    public MovableRectangle(double width, double length, double x, double y, int ySpeed, int xSpeed) {
        super(width, length);
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    @Override
    public void moveUp() {
        y = (y + (1 * ySpeed));
    }

    @Override
    public void moveDown() {
        y = (y - (1 * ySpeed));
    }

    @Override
    public void moveLeft() {
        x = (x - (1 * xSpeed));
    }

    @Override
    public void moveRight() {
        x = (x + (1 * xSpeed));
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "x=" + x +
                ", y=" + y +
                ", ySpeed=" + ySpeed +
                ", xSpeed=" + xSpeed +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
