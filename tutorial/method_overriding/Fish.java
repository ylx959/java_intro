package tutorial.method_overriding;

public class Fish extends Creature{
    @Override
    void move(){
        System.out.println("This animal is swimming");
    }
}