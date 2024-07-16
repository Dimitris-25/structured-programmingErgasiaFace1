package gr.aueb.cf.ch7;

public class ImmutableStr {
    public static void main(String[] args) {
        String s1 = "Alice";
        String s2 = "Alice";

        s2 = "Bob";
        s1 = "Athens";
        System.out.println("S1 and S2 = " + s1 + ' ' + s2);
    }
}
