package gr.aueb.cf.ch4;
import java.util.Scanner;


public class FlexApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int iterations = 0;

        System.out.println("Please insert , start value, end value, step");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i = i + step) {
            iterations++;
            System.out.println("i = " + i + " ");

        }
        System.out.println("iterations: " + iterations);
    }
}
