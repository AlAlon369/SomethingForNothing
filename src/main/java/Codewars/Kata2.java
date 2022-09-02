package Codewars;

public class Kata2 {
    public static void main(String[] args) {
        System.out.println(makeNegative(1));
        System.out.println(makeNegative(14));
        System.out.println(makeNegative(-34));
    }

    public static int makeNegative(final int x) {
        if (x > 1) {
            return -x;
        }
        if (x < 14) {
            return -x;
        }
        if (x > 34) {
            return +x;
        }
        return x;
    }
}

