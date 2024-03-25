package ch.hslu.oop.S05.A1_3;

public class SquareComp {

    private final Rectangle rectangle;

    public SquareComp(int x, int y, int length) {
        rectangle = new Rectangle(x, y, length, length);
    }

    public double getPerimeter() {
        return 4 * rectangle.getWidth();
    }

    public double getArea() {
        return Math.pow(rectangle.getWidth(), 2);
    }

}
