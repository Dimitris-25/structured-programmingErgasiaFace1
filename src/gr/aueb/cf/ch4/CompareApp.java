package gr.aueb.cf.ch4;

/**
 * Chars' collation/sorting is based on code points.
 * That is comparisons between chars is based on the
 * ordinal numbers (code points) according to UCS-2
 * (UTF-16). UCS -2 includes ASCII characters as well as
 * Greek characters in two-byte sequences (bit pattern)
 */

public class CompareApp {
    public static void main(String[] args) {
        char a = 'a';  //Ελληνικο α
        char b = 'b'; // Αγγλικο b
        boolean greekIsGreater = false;

        System.out.println((int) a);
        System.out.println((int) b);
        if (a > b) greekIsGreater = true;

        System.out.println("Greek is greater: " + greekIsGreater);
    }
}
