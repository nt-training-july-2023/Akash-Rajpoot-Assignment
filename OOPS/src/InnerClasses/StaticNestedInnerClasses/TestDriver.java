package InnerClasses.StaticNestedInnerClasses;

public class TestDriver {
    public static void main(String[] args) {
        // create an object of the static nested class
        // using the name of the outer class
        MotherBoard.Usb usb = new MotherBoard.Usb();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}
