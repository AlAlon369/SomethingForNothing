package Codewars;

public class kata51 {
    public static void main(String[] args) {
        System.out.println(isLove(1, 4));
        System.out.println(isLove(2, 2));
    }
    // Timmy & Sarrah думают что любят друг друга. Два аргумента, flower1 и flower2.
    // Если первый аргумент flower1 четный, а второй аргумент flower2 не четный = true.
    // else = false

    // Если flower1 остаток отделения 0, значит четный,
    // Если flower2 остаток отделения не равен нулю, значит нечетный.
    // flower1 - even, flower2 odd = true, else false;

    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower2 % 2 == 0 && flower1 % 2 != 0))
            return true;
        else if ((flower1 == 0 && flower2 % 2 != 0) || (flower2 == 0 && flower1 % 2 != 0))
            return true;
        else
            return false;

    }
}