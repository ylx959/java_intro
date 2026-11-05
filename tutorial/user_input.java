package tutorial;

import java.util.Scanner;

public class user_input {
     public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();

        System.out.print("Enter your age: ");
        int age=scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa=scanner.nextDouble();

        System.out.print("Are you a student(true/false): ");
        boolean isStudent=scanner.nextBoolean();

        System.out.println("Hello "+name+" you are "+age+" year-old");
        System.out.println("Your gpa is "+gpa);
        System.out.println("Student: "+isStudent);

        scanner.close();// Release resources, not memory directly.
    }
}
