package Codewars;

import java.util.Arrays;



public class kata13 {
    public static void main(String[] args) {
        int[] map = map(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(map));
    }




    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] *= 2;
        }

        return arr;
    }
}


   /*     public static void main(String[] args) {
            int max = max(new int[]{4, 6, 2, 1, 9, 63, -134, 566});
            int min = min(new int[]{-52, 56, 30, 29, -54, 0, -110});
            System.out.println(max);
            System.out.println(min);
        }
// Написать две функции, максимум и минимум
// Которая будет получать список интеджеров (целых числе) и возврашать наибольшее, и наименьшее число в этом списке.

        public static int max(int[] list) {

    */