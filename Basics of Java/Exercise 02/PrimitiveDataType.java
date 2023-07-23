public class PrimitiveDataType {

    static int integerValue;
    static double doubleValue;
    static String stringValue;
    static boolean boolValue;
    static char characterValue;

    public static void initializeValues() {
        integerValue = 0;
        doubleValue = 0.0;
        stringValue = "";
        boolValue = false;
        characterValue = '.';
    }

    public static void modifyValues() {
        integerValue = 10;
        doubleValue = 23.3;
        stringValue = "stringModified";
        boolValue = true;
        characterValue = 'a';
    }

    public void printValue(){
        System.out.println(integerValue);
        System.out.println(boolValue);
        System.out.println(doubleValue);
        System.out.println(stringValue);
        System.out.println(characterValue);
    }
  

    public static void main(String[] args) {
       
        PrimitiveDataType value = new PrimitiveDataType();
        value.initializeValues();
        value.modifyValues();
        value.printValue(); 
    }

}