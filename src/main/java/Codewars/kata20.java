package Codewars;

public class kata20 {
    public static void main(String[] args) {


    }


    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)) {
                return true;
            }
        }

        return false;
    }
}
