import java.util.Scanner;

class AreaOfTriangle {

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    // Input the length of the base
    System.out.println("Enter the base");
    double b = scan.nextDouble();

    // Input the length of the height
    System.out.println("Enter the height");
    double h = scan.nextDouble();

    double area = (b * h) / 2; // calculating the area using the formula
    System.out.println("The area of Triangle is: " + area);
  }
}
