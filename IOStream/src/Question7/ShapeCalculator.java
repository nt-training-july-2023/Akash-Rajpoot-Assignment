package Question7;

public class ShapeCalculator {
    public static void main(String[] args) {
        // Rectangle
        double rectangleLength = 5.0;
        double rectangleWidth = 10.0;
        Shape rectangle = () -> rectangleLength * rectangleWidth;

        // Square
        double squareSide = 8.0;
        Shape square = () -> squareSide * squareSide;

        // Circle
        double circleRadius = 5.0;
        Shape circle = () -> Math.PI * Math.pow(circleRadius, 2);

        // Cube
        double cubeSide = 4.0;
        Shape cube = () -> 6.0 * Math.pow(cubeSide, 2);

        // Sphere
        double sphereRadius = 5.0;
        Shape sphere = () -> 4.0 * Math.PI * Math.pow(sphereRadius, 2);

        // Cylinder
        double cylinderRadius = 3.0;
        double cylinderHeight = 8.0;
        Shape cylinder = () -> Math.PI * Math.pow(cylinderRadius, 2) * cylinderHeight;

        // Calculate and display areas
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Cube: " + cube.area());
        System.out.println("Area of Sphere: " + sphere.area());
        System.out.println("Area of Cylinder: " + cylinder.area());
    }
}
