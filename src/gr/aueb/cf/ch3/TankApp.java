package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβανει true / false απο stdio
 * για τις δυο δεξαμενες αν ειναι < 1/4
 * Επεξεργαζεται και αναβει πορτοκαλι αν
 * η μια ειναι <1/4 και κοκκινο αν και
 * οι δυο ειναι 1/4.
 */

public class TankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert tank status (true/false)");
        System.out.println("Tank 1 status: ");
        isEmptyTank1 = scanner.nextBoolean();

        System.out.println("Tank 2 status: ");
        isEmptyTank2 = scanner.nextBoolean();

        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.println("Orange:" + isOrange + ", " + "Red:" +isRed);


    }
}

