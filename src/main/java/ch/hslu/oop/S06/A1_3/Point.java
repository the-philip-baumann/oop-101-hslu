package ch.hslu.oop.S06.A1_3;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this(point.x, point.y);
    }

    int getQuadrant() {
        if (x > 0 && y > 0) {
            return 1;
        }

        if (x < 0 && y > 0) {
            return 2;
        }

        if (x < 0 && y < 0) {
            return 3;
        }

        if (x > 0 && y < 0) {
            return 4;
        }

        return 0;
    }

    void moveRelative(int x, int y) {
        this.x += x;
        this.y += y;
    }

    void moveRelative(Point point) {
        this.x += point.x;
        this.y += point.y;
    }

    void moveRelative(double phi, int r) {
        this.x += (int) (r * Math.cos(phi));
        this.y += (int) (r * Math.sin(phi));
    }
}
