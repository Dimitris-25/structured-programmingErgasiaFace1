package gr.aueb.cf.ch5;

import java.util.Scanner;

public class ParForQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        for(;;) {
            i = in.nextInt();
            if (i == 5) break;
            else {
                System.out.println("Another try ...");
            }
        }
    }
}
