package gr.aueb.cf.ch2;

import java.util.Scanner;
import java.util.Locale;

public class DHMToSec {
    public static void main(String[] args) {
        final int SEC_PER_DAY = 3600 * 24;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;

        Scanner sc = new Scanner(System.in);
        long days, hours, mins, secs;
        long totalSec;

        System.out.println("Δωστε Μερες, Ωρες, Λεπτα, Δευτ/πτα");
        days = sc.nextLong();
        hours = sc.nextLong();
        mins = sc.nextLong();
        secs = sc.nextLong();

        totalSec = (days * SEC_PER_DAY) + (hours * SEC_PER_HOUR) + (mins * SEC_PER_MIN) + (secs);
        System.out.printf(Locale.US, "Total sec: %,d", totalSec);


    }
}
