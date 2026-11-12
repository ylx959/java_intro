package tutorial.inheritance;

public class Organism {
    boolean isAlive;
    static int count=0;

    Organism(){
        isAlive = true;
        count++;
    }

    static void showNum(){
        System.out.println("Total organism: "+count);
    }
}
