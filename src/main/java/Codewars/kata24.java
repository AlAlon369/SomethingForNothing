package Codewars;

import java.lang.module.FindException;
import java.util.Arrays;

public class kata24 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(monkeyCount(5)));
        System.out.println(Arrays.toString(monkeyCount(3)));
        System.out.println(Arrays.toString(monkeyCount(9)));
        System.out.println(Arrays.toString(monkeyCount(10)));
        System.out.println(Arrays.toString(monkeyCount(20)));
    }

    // Учитывая число (n), заполнить массив всеми числами до этого числа включительно,  исключая ноль.

    // К нам приходит final int n, нужно заполнить числами уже имеющийся массив, где N - константа

    public static int[] monkeyCount(final int n) {
        int[] array = new int [n];
        for (int i = 0; i < n; i++) {
            array[i] = i +1;
        }

        return array;
    }

}
