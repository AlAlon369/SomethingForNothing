package Codewars;

import java.util.Arrays;

public class kata47 {
    public static void main(String[] args) {
        System.out.println(consecutive(new int[]{4, 8, 6}));
        System.out.println(consecutive(new int[]{1, 2, 3, 4}));
        System.out.println(consecutive(new int[]{}));
        System.out.println(consecutive(new int[]{1}));
    }
    // Отсортировать массив.
    // Если элемент в массиве равен следующему элементу массива запускаем счетчик.
    public static int consecutive(final int[] arr) {
        int count = 0;
        int consNumberElement = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (consNumberElement < count) {
                    consNumberElement = count;
                }
            }
        }
        return count;
    }
}

