package gr.aueb.cf.ch6;

public class SameEndings {

    public static void main(String[] args) {
        int[] arr1 = {11, 21, 31, 41, 5, 6, 7};  // Should return true (1 is the last digit for 11, 21, 31)
        int[] arr2 = {12, 24, 36, 48, 50};       // Should return false (no last digit appears more than twice)
        int[] arr3 = {15, 25, 35, 45};           // Should return true (5 is the last digit for 15, 25, 35, 45)

        System.out.println(moreThanTwoSameEndings(arr1)); // true
        System.out.println(moreThanTwoSameEndings(arr2)); // false
        System.out.println(moreThanTwoSameEndings(arr3)); // true
    }

    public static boolean moreThanTwoSameEndings(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];

        for (int item : arr) {
            endings[item % 10]++;
        }
        for (int count : endings) {
            if (count >= 3) {
                return true;
            }
        }
        return false;
    }
}