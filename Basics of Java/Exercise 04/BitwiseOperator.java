public class BitwiseOperator {
    public static void main(String[] args) {
        
    int number1 = 8, number2 = 20, result;

    // bitwise OR between 8 and 20
    result = number1 | number2;
    System.out.println(result);    // prints 28
    // bitwise and between 8 and 20
    result = number1 & number2;
    System.out.println(result);    // prints 0
    // bitwise XOR between 8 and 20
    result = number1 ^ number2;
    System.out.println(result);    // prints 28

    }
}
