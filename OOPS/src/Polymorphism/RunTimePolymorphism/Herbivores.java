package Polymorphism.RunTimePolymorphism;
public class Herbivores extends Animal{
    @Override
    void eat(){
        System.out.println("Herbivores Eat Plants");
    }
    @Override
    void walk(){
        System.out.println("Herbivores Animals Walk");
    }
}
