package Polymorphism.CompileTime;

public class Test {
    public static void main(String[] args) {
        Calculator cal1= new Calculator();
        System.out.println(cal1.add(10,10));
        System.out.println(cal1.add(10,20,30));
    }
}
