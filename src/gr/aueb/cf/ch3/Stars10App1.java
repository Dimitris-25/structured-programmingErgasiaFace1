package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανιζει 10 οριζοντια αστερακια
 * δηαλαδη ενα αστερακι 10 φορες
 */
public class Stars10App1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;

        System.out.println("Insert number of iterations");
        n = in.nextInt();

        while (i <= n) {
            System.out.print("*");
            i++;

        }
    }

}

