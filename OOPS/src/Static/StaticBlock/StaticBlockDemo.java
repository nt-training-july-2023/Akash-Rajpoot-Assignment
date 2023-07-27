package Static.StaticBlock;

public class StaticBlockDemo {
    static int number;
    static {
        System.out.println("Static block 1");
        number = 50;
    }
    static {
        System.out.println("Static block 2");
        number = number * 5;
    }
    static {
        System.out.println("Static block 3");
        number = number + 500;
    }
    // Static method
    static void displayNumber() {
        System.out.println("Number = " + number);
    }

    public static void main(String[] args) {
        System.out.println("Main method Working started");
        displayNumber();
        System.out.println("Main method Working finished");
    }
}