package gr.aueb.cf.ch3;

/**
 * Deixnei ti xrisi twn break kai continue
 */

import java.util.Scanner;

public class BreakContinueApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Please provide a num");
            num = in.nextInt();
            // if the num = 5 ignore
            //and continue to the next loop
            if (num == 5) {
                continue;
            }
            sum += num;

            // if num equals 10 then stop immediately the
            // loop and get out of while
             if (num == 10) {
                 break;
             }

        }
        System.out.println("Sum: " + sum);
    }
}
