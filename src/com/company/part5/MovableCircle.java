package com.company.part5;

public class MovableCircle extends Circle implements Movable {
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(radius);
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
