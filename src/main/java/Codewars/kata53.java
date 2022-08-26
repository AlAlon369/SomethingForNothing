package Codewars;

import java.util.Arrays;

public class kata53 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1, 4)));
        System.out.println(Arrays.toString(between(-2, 2)));
    }
         // Завершить функцию которая принимает два интеджера a, b. где a < b.
         // return array с интеджерами которые находятся между параметрами, включая их.
         // b = 4, a = 1, size arr 4 - 1 + 1 = 4;     1 2 3 4
         // b = 2; a = -2; size arr 2 -- 2 + 1 = 5;   -2 -1 0 1 2
    public static int[] between(int a, int b) {
        int c = 0;
        int [] arr = new int [b - a + 1];
        for (int i = a; i <= b; i++) {
            arr[c] = i;
            c++;
        }
        return arr;
    }
}


