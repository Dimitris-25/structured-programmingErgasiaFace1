package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ypologizei to base power
 * O xristis dinei to base power
 */

public class PowerApp1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please insert base, power");
        base = in.nextInt();
        power = in.nextInt();

        while (i <= power) {
            result *= base;
            i++;

        }
        System.out.printf("%d ^ %d= %,d\n",base, power, result);
        System.out.printf("2 ^ 8 = %d",(int) Math.pow(2, 8));




    }



}
