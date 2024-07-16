package gr.aueb.cf.ch2;

/**
 * Χρησιμοποιει την Math.random() που παραγει
 * τυχαιους δεκαδικους αριθμους μεταξυ 0 - 0.9,
 * δηαλδη, 0 <= randomNum  <1 για να μας δωσει
 * τυχαιες τιμες μεταξυ 1-6, οπως δηλαδη ενα ζαρι
 */

public class RandomDemo {
    public static void main(String[] args) {
        int die = (int) (Math.random() * 6) + 1;
        System.out.println(die);
    }
}
