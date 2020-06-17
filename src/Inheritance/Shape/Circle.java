package Inheritance.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double area) {
        super(area);
    }

    public Circle(double area, double radius) {
        super(area);
        this.radius = radius;
    }}
