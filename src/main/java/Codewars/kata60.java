package Codewars;

import java.util.Arrays;

public class kata60 {
    public static void main(String[] args) {
        System.out.println(findSmallestInt((new int[]{78,56,232,12,11,43})));
        System.out.println(findSmallestInt((new int[]{78,56,-2,12,8,-33})));
    }
       // Нам дан массив интеджеров.
       // Нужно вернуть самое маленькое число из массива.

       // План
       // Отсортировать массив.
       // Вернуть последний элемент из массива

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];


        /*
        int min = args[0];
        for (int arg : args) {
            if (min > arg) {
                min = arg;
            }
        }
       return min;

         */
    }
}
