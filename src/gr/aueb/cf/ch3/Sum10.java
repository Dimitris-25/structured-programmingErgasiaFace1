package gr.aueb.cf.ch3;

/**
 * Ypologizei to athroisma tvn 10 prwtwn arithmwn
 * apo to 1 ews to 10
 */

public class Sum10 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 3;

        while (i <= 10) {
            sum = sum + i; // h sum+=1;
            i++;

        }
        System.out.println("Sum = " + sum);


    }
}
