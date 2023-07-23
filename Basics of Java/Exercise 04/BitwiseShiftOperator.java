public class BitwiseShiftOperator {
    public static void main(String[] args) {
        
    // There are three types of shift operators in Java:

    // Signed Left Shift (<<)
    // Signed Right Shift (>>)
    // Unsigned Right Shift (>>>)

    int number = 2;
   
    // 2 bit left shift operation 
    int result = number << 2;
    System.out.println(result);    // prints 8

    // 2 bit right shift operation 
    result = number >> 2;
    System.out.println(result);    // prints 2

    int number1 = 8;
    int number2 = -8;
    
    // 2 bit signed right shift
    System.out.println(number1 >> 2);    // prints 2
    System.out.println(number2 >> 2);    // prints -2

    }
}
