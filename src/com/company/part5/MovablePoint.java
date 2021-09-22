package com.company.part5;

public class MovablePoint implements Movable {

    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
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

}
