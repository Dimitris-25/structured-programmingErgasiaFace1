package gr.aueb.cf.ch5;

public class OverLoadingApp {
    public static void main(String[] args) {

    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(long a, long b) {
        return (int) (a+b);
    }
    public static int add(Long a, int b) {
        return (int) (a + b);
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
