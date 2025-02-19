package gr.aueb.cf.ch3;
import java.util.Scanner;

/**
 * Mono dyo aritmoi kerdizoun.
 * Oi 5 kai 12. To 70 einai oudetero.
 */

public class WinApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean found = false;

        while (!found) {
            System.out.println("Please give the lucky number");
            num = in.nextInt();
            if (num != 12 && num != 5 && num != 70) {
                System.out.println("No lucky number given");
                break;
            }
            if (num == 5) {
                found = true;
            }
            else if (num == 12) {
                found = true;
            }
            System.out.println("No lucky number found");
        }
        if (found) System.out.println("Found: " + num);
        else System.out.println("No lucky number found");
    }
}
