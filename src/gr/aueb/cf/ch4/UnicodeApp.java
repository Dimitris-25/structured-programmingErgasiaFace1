package gr.aueb.cf.ch4;

import java.util.Arrays;

public class UnicodeApp {
    public static void main(String[] args) {
        int smiley = 0x1f600; //UTF-8 smiley
        System.out.println("Smiley: \uD83D\uDE00");

        System.out.print("Smiley: ");
        System.out.println(Character.toChars(smiley));


    }
}
