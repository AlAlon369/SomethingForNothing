package Codewars;

import java.util.Arrays;

public class kata19 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{-1, -2, -3, -4, -5})));
        System.out.println(Arrays.toString(invert(new int[]{1,-2,3,-4,5})));
        System.out.println(Arrays.toString(invert(new int[]{})));


    }
      // Нам приходит массив new int[] -1, -2, -3, -4, -5
      // задача развернуть - негативные числа в положительные, и наоборот

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {        // В цикле фор мы пробегаемся по массиву new int[array.length]
            array[i] = -array[i];                       // Говорим что Array[i] = -array[i]
        }
        return array;
    }
}
