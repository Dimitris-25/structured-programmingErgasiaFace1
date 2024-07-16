package gr.aueb.cf.ch5;

/**
 * stroggylopoihsh dekadikwn
 * demostrates ceil, floor, random
 */

public class MathApp {
    public static void main(String[] args) {
        double d = 3.45;

        System.out.printf("%.2f: ceil: %d, floor: %d ", d, getCeil(d), getFloor(d));
        System.out.println("Random value between 1-100:" + getRandom(1, 100));

    }

    /**
     * Rounds the input num
     *
     * @param num the input num
     * @return return the double result
     *
     */
    public static int getCeil(double num) {

        return (int) Math.ceil(num);
    }

    /**
     * Trancates the floating points of the input num
     *
     * @param num the input num
     * @return  the truncates result.
     */
    public static int getFloor(double num) {

        return (int) Math.floor(num);
    }

    /**
     * Returns a random integer between min and max.
     * @param min the minimum value.
     * @param max the maximum value.
     * @return a random int between min and max.
     */

    public static int getRandom(int min, int max) {

        return (int) (Math.random() * (max - min)) + min;
    }
}
