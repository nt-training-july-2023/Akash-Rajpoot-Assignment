package AreaCalculate;
/**
 * This is Triangle class
 * @author Akash Rajpoot
 * @version 1.0
 * since 26-07-2023**/
public class Trianlge extends Shape{
    private double base;
    private double height;

    Trianlge(double base,double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return (base*height)/2;
    }
}
