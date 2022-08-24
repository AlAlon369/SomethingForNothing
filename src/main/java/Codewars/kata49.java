package Codewars;

import java.util.Arrays;

public class kata49 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(438597)));
        System.out.println(Arrays.toString(digitize(0)));
    }

    // Мне дано long n, я из этого long n должен брать числа, с обратного порядка, и аппендить их в массив.

    // Стрингбилдер.
    // Пробежаться с конца массива, и аппендить в массив числа, в обратном порядке.
    // split.
    // reverse(), append
    // конвертация лонга в инту, т.к. лонг весит 8 байтов, а инт 4.


    public static int[] digitize(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String newString[] = sb.reverse().toString().split("");
        int[] arr = new int[newString.length];
        for (int i = 0; i < newString.length; i++) {
            arr[i] = Integer.parseInt(newString[i]);
        }
        return arr;
    }
}
