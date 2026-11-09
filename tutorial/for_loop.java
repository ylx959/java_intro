package tutorial;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) throws InterruptedException {

        // for loop = execute some code a CERTAIN amount of times

        Scanner scanner = new Scanner(System.in);

        int start;

        System.out.print("How many seconds to countdown from?: ");
        start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            //只有 Thread A 暫停，Thread B 仍然可以繼續執行。
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");
    }

}
