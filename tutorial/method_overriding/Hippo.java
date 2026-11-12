package tutorial.method_overriding;

public class Hippo extends Creature{
    @Override
    void move(){
        System.out.println("This animal is wandering");
    }
}
