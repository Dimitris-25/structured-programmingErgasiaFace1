package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 *Switch instead of many if-then-else
 *Gets user's choise and give feedback
 */
public class SwitchApp2DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;

        do {
            System.out.println("Please select one of the following");
            System.out.println("1. One player game");
            System.out.println("2. Two players game");
            System.out.println("3. Team game");
            System.out.println("4. Exit");
            System.out.println("Please insert your choise");


            //Get the choise

            choise = in.nextInt();



            switch (choise) {
                case 1:
                    System.out.println("Start one-player game");
                    break;
                case 2:
                    System.out.println("Start two player game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                case 4:
                    System.out.println("Exit game");
                    break;
                default:
                    System.out.println("Error in choise");
                    break;
            }


        } while (choise!=4);

        System.out.println("Goodbye!");

    }
}
