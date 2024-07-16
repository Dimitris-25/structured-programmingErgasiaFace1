package gr.aueb.cf.ch6;

public class ReducingApp {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int sum = getSum(arr);
        double avg = getAvg(arr);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }

    /**
     * Reduces the input arr to sum of its elements.
     *
     * @param arr the input array.
     * @return the sum of array elements.
     */
    public static int getSum(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int sum = 0;

        for (int item : arr) {
            sum += item;
        }
        return sum;
    }

    /**
     * Computes the average of the elements in the input array.
     *
     * @param arr the input array.
     * @return the average of array elements.
     */
    public static double getAvg(int[] arr) {
        if (arr == null || arr.length == 0) return -1.0;

        int sum = 0;

        for (int item : arr) {
            sum += item;
        }
        return (double) sum / arr.length;
    }
}