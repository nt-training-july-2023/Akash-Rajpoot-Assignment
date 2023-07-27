package InnerClasses.NestedInnerClass;

import InnerClasses.NestedInnerClass.Cpu;

public class Test {
    public static void main(String[] args) {
        Cpu cpu = new Cpu();

        // create an object of inner class Processor using outer class
        Cpu.Processor processor = cpu.new Processor();

        // create an object of inner class RAM using outer class CPU
        Cpu.Ram ram = cpu.new Ram();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}
