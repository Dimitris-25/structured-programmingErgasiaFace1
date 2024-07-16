package gr.aueb.cf.ch3;

import java.util.Scanner;


/**
 * Υπολογιζει το αθροισμα των 10 πρωτων
 * αριθμων, απο 1-10.
 */

public class SumNApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        int n = 0;


        System.out.println("Plaese insert n");
        n = in.nextInt();

        while (i <= n) {
            sum = sum +=i;
            i++;

        }
        System.out.println("Sum = " + sum);

    }
}
