package RectangleArea;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        try {
            int validLength = 5;
            int validWidth = 10;
            int validArea = Rectangle.calculateArea(validLength, validWidth);
            System.out.println("Valid area: " + validArea);

            int invalidLength = -3;
            int invalidWidth = 7;
            int invalidArea = Rectangle.calculateArea(invalidLength, invalidWidth);
            System.out.println("This won't be printed because of the exception.");

        } catch (InvalidDimensionException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
