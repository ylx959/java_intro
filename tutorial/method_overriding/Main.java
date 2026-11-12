package tutorial.method_overriding;

import tutorial.inheritance.Cat;
import tutorial.inheritance.Dog;

public class Main {
     public static void main(String[] args) {

        // Method overriding = When a subclass provides its own
        //                                      implementation of a method that is already defined.
        //                                      Allows for code reusability and gives specific implementations.

        Tiger tiger= new Tiger();
        Hippo hippo = new Hippo();
        Fish fish = new Fish();

        hippo.move();
        tiger.move();
        fish.move();

    }
}
