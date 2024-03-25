package ch.hslu.oop.S05.A1_3;

public abstract class Shape {

    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
