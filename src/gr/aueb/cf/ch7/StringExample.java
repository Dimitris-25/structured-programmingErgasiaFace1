package gr.aueb.cf.ch7;


public class StringExample {
    public static void main(String[] args) {
        String originalText = "Hello, World!";
        System.out.println("Original Text: " + originalText);

        // Η μέθοδος charAt επιστρέφει τον χαρακτήρα στη συγκεκριμένη θέση
        char firstChar = originalText.charAt(0);
        System.out.println("First Character: " + firstChar);

        // Η μέθοδος length επιστρέφει το μήκος της συμβολοσειράς
        int length = originalText.length();
        System.out.println("Length: " + length);

        // Η μέθοδος substring επιστρέφει ένα τμήμα της συμβολοσειράς
        String substring = originalText.substring(7, 12);
        System.out.println("Substring: " + substring);
    }
}
