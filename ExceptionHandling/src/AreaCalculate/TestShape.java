package AreaCalculate;
/**
 * This is TestShape class
 * @author Akash Rajpoot
 * @version 1.0
 * since 26-07-2023**/

public class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle(12);
        Rectanlge r1= new Rectanlge(12,13);
        Trianlge t1 = new Trianlge(12,15);
        System.out.println(c1.calculateArea());
        System.out.println((r1.calculateArea()));
        System.out.println(t1.calculateArea());

    }
}
