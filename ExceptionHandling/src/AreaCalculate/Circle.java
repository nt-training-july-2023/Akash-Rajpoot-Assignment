package AreaCalculate;
/**
 * This is Circle class
 * @author Akash Rajpoot
 * @version 1.0
 * since 26-07-2023**/
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (3.14)*(radius*radius);
    }
}
