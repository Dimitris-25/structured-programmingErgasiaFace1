package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Vriskei to apoluto enos akeraiou
 * kai to emafnizei mesa stin print
 */

public class TernaryPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;

        System.out.println("Please insert a num");
        num1 = in.nextInt();

        System.out.printf("Abs of %d is: %d", num1, (num1 > 0) ? num1 : -num1);

    }
}
