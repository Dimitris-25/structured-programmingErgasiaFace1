package gr.aueb.cf.ch2;

/**
 * Προσθετει δυο ακεραιους και εμφανιζει
 * το αποτελεσμα στην κονσολα(standard output)
 */
public class AddApp {
    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 7;
        int num2 = 12;
        int result = 0;

        //Εντολες
        result =  num1 + num2;

        //Εκτυπωση αποτελεσματων
        System.out.println("Το αθροισμα των " + num1 + "και" + num2 + " ειναι: " + result);
        System.out.printf("Το αθροισμα των %d και %d ειναι: %d", num1, num2, result);
    }
}
