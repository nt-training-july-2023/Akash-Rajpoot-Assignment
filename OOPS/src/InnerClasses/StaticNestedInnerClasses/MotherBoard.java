package InnerClasses.StaticNestedInnerClasses;

public class MotherBoard {
    //Static Nested Inner Class
    static class Usb{
        int usb2 = 2;
        int usb1= 1;

        int getTotalPorts(){
            return usb1+usb2;
        }
    }
}
