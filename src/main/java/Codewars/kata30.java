package Codewars;

public class kata30 {
    public static void main(String[] args) {
        System.out.println(countingSheep(0));
        System.out.println(countingSheep(1));
        System.out.println(countingSheep(2));
        System.out.println(countingSheep(3));

    }


    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= num; i++) {
            result.append(i).append(" sheep...");
        }

        return result.toString();


    }
}