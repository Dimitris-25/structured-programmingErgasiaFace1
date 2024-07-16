package gr.aueb.cf.ch2;

public class IntPrintDemon {
    public static void main(String[] args) {
        int i = 10, j = 5;
        int sum = 0;

        sum = i + j;

        System.out.println("Το αθροισμα των " + i + "και" + j + " ειναι: " + sum + ".");
        System.out.printf("Το αθροισμα των %d και %d ειναι: d%.%n", i, j, sum);
    }
}
