package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * ypologizei to emvado
 * enos paralliloggramou
 */

public class CalculateRectangleAreaApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        System.out.println("Please insert two integers: ");
        width = in.nextDouble();
        height = in.nextDouble();
        area = calculateArea(width, height);

        System.out.println("Area: " + area);

    }

    /**
     * Ypologizei to emvadon enos
     * parallilogranmmou
     * @param width  to platos tou parallilogrammou
     * @param height  to ypsos tou parallilogrammou
     * @return  returns the area of the retungle
     */
    public static double calculateArea(double width, double height) {
        return width * height;

    }
}
