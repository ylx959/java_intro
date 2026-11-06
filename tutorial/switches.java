package tutorial;

import java.util.Scanner;

public class switches {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements
        //                                   (Java14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine().toLowerCase();

        switch(day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println("It is a weekday 😩");
            case "saturday", "sunday" ->
                    System.out.println("It is the weekend 😀");
            default -> System.out.println(day + " is not a day");
        }

        scanner.close();
    }

}
