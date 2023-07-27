package Polymorphism.RunTimePolymorphism;
public class Omnivores extends Animal{
    @Override
    void eat(){
        System.out.println("Omnivores Eat Plants and meat");
    }
    void walk(){
        System.out.println(" Omnivores Animals Walk");
    }
}
