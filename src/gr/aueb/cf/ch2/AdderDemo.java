package gr.aueb.cf.ch2;

public class AdderDemo {
    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 10;
        int num2 = 5;
        int sum = 0;

        //Εντολες
        sum = num1 + num2;

        //Εκτυπωση αποτελεσματος
        System.out.println("Το αθροισμα του αποτελεσματος των " + num1 +  " και " + num2 + " ειναι " + sum);
        System.out.printf("Το αθροισμα των %d και %d ειναι %d ", num1, num2, sum);
    }
}
