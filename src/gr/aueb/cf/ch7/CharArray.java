package gr.aueb.cf.ch7;

public class CharArray {
    public static void main(String[] args) {
        String originalText = "Hello, World!";

        // Μετατροπή του String σε char[]
        char[] charArray = originalText.toCharArray();

        // Εμφάνιση των χαρακτήρων του πίνακα
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Δημιουργία ενός String από έναν πίνακα χαρακτήρων
        String newText = new String(charArray);
        System.out.println("New Text: " + newText);
    }
}

