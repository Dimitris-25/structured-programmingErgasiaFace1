package gr.aueb.cf.ch6;

public class ArrayCopy {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] arrayCopy = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arrayCopy[i] = arr[i];
        }
        printArray(arrayCopy);
    }
    public static void printArray(int[] arr) {
        for (int item: arr) {
            System.out.println(item + " ");
        }
        System.out.println();
    }
}
