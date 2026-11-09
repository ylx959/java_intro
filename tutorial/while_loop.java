package tutorial;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        // String name="";

        // while(name.isEmpty()){
        //     System.out.print("Enter your name");
        //     name=scanner.nextline();
        // }

        // System.out.println("Hello"+name);

        String response="";

        while(!response.equals("Q")){
            System.out.print("Tap Q to quit");
            response=scanner.next().toUpperCase();
        }

        System.out.println("You have quit");

        scanner.close();


    }
}
