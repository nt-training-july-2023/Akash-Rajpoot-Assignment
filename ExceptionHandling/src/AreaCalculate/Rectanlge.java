package AreaCalculate;
/**
 * This is Rectangle class
 * @author Akash Rajpoot
 * @version 1.0
 * since 26-07-2023**/
public class Rectanlge extends Shape{
   private double length;
   private double width;
    public Rectanlge(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length*width;
    }
}
