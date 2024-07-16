package gr.aueb.cf.ch2;
import java.util.Scanner;

/**
 * Scanner Demo. Reads two ints from standard
 * input (keyboard) and gets/prints the sum
 */

public class ScannerApp {
    public static void main(String[] args) {
        // Δηλωση (declaration) μεταβλητων
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        //entoles
        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;

        //Emfanisi apotelesmatwn
        System.out.println(num1 + " + " + num2 + " = " + sum);

    }
}
