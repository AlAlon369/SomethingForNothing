package Codewars;

public class kata32 {
    public static void main(String[] args) {
        System.out.println(stringy(6));
        System.out.println(stringy(4));
        System.out.println(stringy(12));

    }

    //


    public static String stringy(int size) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                result.append("1");
            } else {
                result.append("0");
            }
        }
        return result.toString();
    }
}




