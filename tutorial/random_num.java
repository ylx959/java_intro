package tutorial;

import java.util.Random;

public class random_num {
    public static void main(String[] args) {
        
        Random random = new Random();//set object
        
        int number;
        boolean isHeads;

        number = random.nextInt(1, 7);//1 to 6
        
        isHeads = random.nextBoolean();

        System.out.println(number);
        
        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
