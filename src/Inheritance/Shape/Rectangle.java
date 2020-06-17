package Inheritance.Shape;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(double area, int length, int width) {
        super(area);
        this.length = length;
        this.width = width;
    }

}
