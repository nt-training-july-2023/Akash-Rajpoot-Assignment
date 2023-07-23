public class EqualsOperator {
    public static void main(String[] args) {
        
        String str1 = new String("NUCLEUSTEQ");
        String str3 = "NUCLEUSTEQ";
        String str4 = "NUCLEUSTEQ";

        System.out.println(str1.equals(str3)); // true
        System.out.println(str1 == str3); // False
        System.out.println(str3 == str4); // true
    }
}

//We can use == operators for reference comparison (address comparison) and .equals() method for 
//content comparison. In simple words, == checks if both objects point to the same memory location whereas .
//equals() evaluates to the comparison of values in the objects.