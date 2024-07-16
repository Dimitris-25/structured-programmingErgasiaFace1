package gr.aueb.cf.ch5;

/**
 * Demonstrates overLoading(Υπερφορτωση).
 * υπερφορτωση = ιδιο ονομα μεθοδου
 * διαφορετικες τυπικες παραμετροι
 * method signature = Ονομα της μεθοδου και οι τυπικες παραμετροι.
 *
 */

public class OverLoadingApp2 {
    public static void main(String[] args) {
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        sum2 = add(1, 2);
        sum3 = add(1,2,3);
        sum3 = add(1,2,3,4);


    }
    /**
     *Add two integers
     * @param a int q
     * @param b int b
     * @return the sum of two integers
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Add three integers
     * @param a int a
     * @param b int b
     * @param c int c
     * @return the sum of  three integers
     */

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    /**Add four integers
     *
     * @param a int a
     * @param b int b
     * @param c int c
     * @param d int d
     * @return the sum of four integers
     */
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
