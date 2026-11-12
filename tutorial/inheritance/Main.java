package tutorial.inheritance;

public class Main {
     public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //                         from another class.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.eat();//Animal
        dog.speak();

        System.out.println("Plant is alive: "+plant.isAlive);
        System.out.println("Dog is alive: "+dog.isAlive);
        System.out.println("Cat is alive: "+cat.isAlive);

        Organism.showNum();

    }
}
