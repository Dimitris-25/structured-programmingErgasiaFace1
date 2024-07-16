package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δεχεται ως εισοδο: 1) Συνολο βαθμολογιας και 2) πληθος μαθηματων
 * και υπολογιζει τον μεσο ορο. Στη συνεχεια δινει feedback στον χρηστη
 * : 9-10 Αριστα, 7-8 καλως, 5-6 λιαν καλως, κατω απο 5 Αποτυχια.
 */

public class NestedIfApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int modulesCount = 0;
        int totalMarks = 0;
        int average = 0;

        System.out.println("Please insert the sum of grades");
        totalMarks = in.nextInt();

        System.out.println("Please insert modules count");
        modulesCount = in.nextInt();

        if (modulesCount == 0) {
            System.out.println("Modules count cant be zero");
            System.exit(1);
        }

        average = totalMarks / modulesCount;

        if (average < 0 || average > 10) {
            System.out.println("Error in input data");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent: " + average);
        }
        if (average >= 7) {
            System.out.println("very good: " + average);
        }
        if (average >= 5)  {
            System.out.println("Good: " + average);
        }
        else {
            System.out.println("Failed: " + average);
        }


    }
}