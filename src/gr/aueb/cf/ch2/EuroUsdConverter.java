package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * Euro to Usd converter
 */

public class EuroUsdConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputEuros;
        final int Parity = 99; // USA cents
        int totalUsaCents, usaCents, usaDollars;

        System.out.println("Please insert an ammount (in Euros)");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * Parity;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d euros = %d usa cents = %d usa dollars & %d usa cents", inputEuros, totalUsaCents, usaDollars, usaCents );



    }
}

