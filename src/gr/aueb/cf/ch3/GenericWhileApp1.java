package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης δινει αρχικη τιμη, τελικη τιμη
 * και step και το προγραμμα υπολογιζει ποσες
 * φορες εκτελειται μια while
 */


public class GenericWhileApp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;


        System.out.println("Please insert, beginValue, EndValue and Step");
        start = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        while (start <= endValue) {
            counter += 1;
            start += step;
        }
        System.out.println("Iteration count: " + counter);

    }
}
