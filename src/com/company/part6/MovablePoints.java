package com.company.part6;

class MovablePoints implements Movable {

    protected double x1;
    protected double y1;
    protected double x2;
    protected double y2;
    protected int x1Speed;
    protected int y1Speed;
    protected int x2Speed;
    protected int y2Speed;

    public MovablePoints(double x1, double y1, double x2, double y2, int x1Speed, int y1Speed, int x2Speed, int y2Speed) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x1Speed = x1Speed;
        this.y1Speed = y1Speed;
        this.x2Speed = x2Speed;
        this.y2Speed = y2Speed;
    }

    @Override
    public String toString() {
        return "MovablePoints{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", x1Speed=" + x1Speed +
                ", y1Speed=" + y1Speed +
                ", x2Speed=" + x2Speed +
                ", y2Speed=" + y2Speed +
                '}';
    }

    @Override
    public void moveUp() {
        y1 = (y1 + (1 * y1Speed));
        y2 = (y2 + (1 * y2Speed));
    }

    @Override
    public void moveDown() {
        y1 = (y1 - (1 * y1Speed));
        y2 = (y2 - (1 * y2Speed));
    }

    @Override
    public void moveLeft() {
        x1 = (x1 - (1 * x1Speed));
        x2 = (x2 - (1 * x2Speed));
    }

    @Override
    public void moveRight() {
        x1 = (x1 + (1 * x1Speed));
        x2 = (x2 + (1 * x2Speed));
    }

    public void checkSpeed() {
        if (x2Speed != y2Speed || x1Speed != y1Speed ) {
            x1Speed = 1;
            y1Speed = 1;
            y1Speed = 1;
            y2Speed = 1;
        }
    }
}
