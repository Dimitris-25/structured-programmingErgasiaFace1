package gr.aueb.cf.ch5;

/**
 * Metatrepei vathmous farenait se celsious
 */

public class FahrenheitToCelsiusApp {
    public static void main(String[] args) {
        for (int i = - 100; i <= 100; i+= 10) {
            System.out.printf("%4d\u2109\t=\t%6.2f\u2103\n", i, getCelsiusFromFahrenheit(i));
        }

    }

    /**
     * Converts fahrenheit to celsius
     * @param fahrenheitDegrees
     *          the input in fahrenheit degrees
     * @return
     * return celsius degrees after converting from fahrenheit.
     */
    public static double getCelsiusFromFahrenheit(double fahrenheitDegrees) {

        return (fahrenheitDegrees - 32) * 5/9;
    }
}
