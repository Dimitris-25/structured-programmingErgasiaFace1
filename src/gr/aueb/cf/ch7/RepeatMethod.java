package gr.aueb.cf.ch7;

public class RepeatMethod {
    public static void main(String[] args) {
        // 20horizontal stars
        System.out.println("*".repeat(20));

        // 10X10 stars
        for (int i = 0; i <= 10; i++) {
            System.out.println("*".repeat(10));
        }
    }
}
