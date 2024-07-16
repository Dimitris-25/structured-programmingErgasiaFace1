package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;


        do {
           // printMenu();
            //choise = getUserChoise();

            switch (choise) {
                case 1:
                    System.out.println("Επιτυχης εισαγωγη");
                    break;
                case 2:
                    System.out.println("Επιτυχης διαγραφη");
                    break;
                case 3:
                    System.out.println("Επιτυχης αναζητηση");
                    break;
                case 4:
                    System.out.println("Επιτυχης εξοδο");
                    break;
                case 5:
                    System.out.println("Λαθος επιλογη");
                    break;

            }
        }while (choise!= 5);
    }
}
