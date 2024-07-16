package gr.aueb.cf.ch3;

import java.util.Scanner;


/**
 * Υπολογιζει το γινομενο των n πρωτων
 * ακεραιων
 */

public class MulGeneric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // to 1 einai to oudetero stoixeio tou pol/siasmou
        int result = 1;
        int n = 0;
        int i = 1;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            result = result * i;
            i++;

        }
        System.out.println("Result = " + result);

    }
}
