package gr.aueb.cf.ch3;

/**
 * Υπολογιζει το γινομενο των 10 πρωτων
 * ακεραιων
 */

public class Mul10 {

    public static void main(String[] args) {
        // to 1 einai to oudetero stoixeio tou pollaplasiasmou
        int result = 1;
        int i = 1;

        while (i <= 10) {
            result = result * i;
            i++;

        }
        System.out.println("Result = " + result);
    }
}
