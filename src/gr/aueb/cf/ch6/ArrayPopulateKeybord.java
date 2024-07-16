package gr.aueb.cf.ch6;

import java.util.Scanner;


public class ArrayPopulateKeybord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ages = new int[5];


        for (int i = 0; i < ages.length; i++) {
            System.out.println("Δωστα αριθμο για την θεση " + (i+1));
            ages[i] = sc.nextInt();
        }
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i] + " ");
        }
    }
}

