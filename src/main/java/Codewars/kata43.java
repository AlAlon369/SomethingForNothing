package Codewars;

public class kata43 {
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }

    // приходит стринга, нужно проверить, имеет ли она одинаковое количество "х" и "o"
    // Если строка пустая, должно придти true.
    // План
    // посчитать все "x" и "o", если сумма плюс количество "X" и "O" = 0, значит их равное количество.
    // split [].
    // Бегу по массиву, и считаю количество x и o. если их одинаковое количество - true.

    public static boolean getXO(String str) {
        str = str.toLowerCase();
        String arr[] = str.split("");
        int x = 0;
        int o = 0;
        for (int i = 0; i < str.length(); i++) {
            if (arr[i].equals("x")) {
               x++;
            }
            else if (arr[i].equals("o")) {
                o++;
            }
        }
        return x == o;
    }
}
