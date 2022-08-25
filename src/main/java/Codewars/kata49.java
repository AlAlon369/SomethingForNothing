package Codewars;

import java.util.Arrays;

public class kata49 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(1, 10)));
        System.out.println(Arrays.toString(countBy(2, 5)));
        System.out.println(Arrays.toString(countBy(3, 7)));
        System.out.println(Arrays.toString(countBy(50, 5)));
        System.out.println(Arrays.toString(countBy(100, 6)));
    }

                // даны два аргумента, int x, int n.
                // int x должен повторять себя столько раз, чему равен int n.
                // return arr;

                // План
               // Если x = 5, а n = 4
               // тогда [5, 10, 15, 20]
               // размер [] равен n, или
    // обращение к предыдущему элементу массива.

    public static int[] countBy(int x, int n) {
        int[] arr = new int [n];
        arr[0] = x;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + x;
        }
        return arr;
    }
}


