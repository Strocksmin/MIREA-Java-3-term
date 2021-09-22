package com.company.part6;

public class MovablePointRectangle extends Rectangle implements Movable {

    public MovablePoints points;

    public MovablePointRectangle(double x1, double y1, double x2, double y2, int x1Speed, int y1Speed, int x2Speed, int y2Speed) {
        super(Math.abs(x1-x2), Math.abs(y1-y2));
        this.points = new MovablePoints(x1, y1, x2, y2, x1Speed, y1Speed, x2Speed, y2Speed);
    }

    @Override
    public void moveUp() {
        points.moveUp();
    }

    @Override
    public void moveDown() {
        points.moveDown();
    }

    @Override
    public void moveLeft() {
        points.moveLeft();
    }

    @Override
    public void moveRight() {
        points.moveRight();
    }

    @Override
    public String toString() {
        return "MovablePointRectangle{" +
                "points=" + points +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
