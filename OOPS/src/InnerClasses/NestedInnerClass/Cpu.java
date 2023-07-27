package InnerClasses.NestedInnerClass;

public class Cpu {
    double price;
    // Nested Class
    class Processor{
        double cores;
        String manufacture;

        double getCache(){
            return 4.3;
        }
    }
    //Nested Protected Class
    protected class Ram{
        double memory;
        String manufacture;
        double getClockSpeed(){
         return 12.2;
        }
    }
}
