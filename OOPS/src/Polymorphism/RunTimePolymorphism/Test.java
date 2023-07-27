package Polymorphism.RunTimePolymorphism;
public class Test {
    public static void main(String[] args) {
        Animal A = new Animal();
        Animal h = new Herbivores(); //upcasting
        Animal o = new Omnivores() ;//upcasting
        Animal c = new Carnivores(); //upcasting
        A.eat();
        h.eat();
        o.eat();
        c.eat();
    }
}