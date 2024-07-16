package gr.aueb.cf.ch5;

/**
 * Amoivaia antallasei tis times  duo akeraiwn
 */

public class SwappApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a: %d, b: %d\n", a, b);
        swap(a, b);
        System.out.printf("a: %d, b: %d", a, b);

    }

    /**
     * mutually interchanges the values of the wto integers
     * @param a the first integer
     * @param b the second integer
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;

    }
}
