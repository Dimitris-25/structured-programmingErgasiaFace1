package gr.aueb.cf.ch5;

/**
 * Προσθετει δυο ακεραιους με τη χρηση μεθοδων
 */

public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = AddApp.add(a, b);

        System.out.printf("%d + %d = %d", a, b, result);
        //System.out.println("Result: ", + result)

    }

    /**
     * adds two integers
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public static int add(int a, int b) {
        int result = 0;

        result = a + b;

        return result;


    }
}
