package RectangleArea;

public class Rectangle {
    public static int calculateArea(int length, int width) throws InvalidDimensionException {
        if (length <= 0 || width <= 0) {
            throw new InvalidDimensionException("Invalid dimensions. Length and width must be positive integers.");
        }
        return length * width;
    }
}

