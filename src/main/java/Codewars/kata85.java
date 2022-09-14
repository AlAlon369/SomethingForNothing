package Codewars;

import java.util.Arrays;

public class kata85 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(minMax(new int[]{2334454, 5})));
        System.out.println(Arrays.toString(minMax(new int[]{1})));
    }
     // У Бэна есть очень простая идея для получения прибыли: он что-то покупает и снова продает.
     // Конечно, это не принесло бы ему никакой прибыли, если бы он просто покупал и продавал по одной и той же цене.
     // Бэн покупает по самой низкой цене и продает по самой высокой.

     // Напишите функцию, которая возвращает минимальное и максимальное значение (элементов) из массива.
     // Example: [1,2,3,4,5] --> [1,5]     [2334454,5] --> [5,2334454]     [1]         --> [1,1]
     // Примечания: Все массивы или списки всегда будут иметь хотябы один элемент, поэтому не нужно проверять длинну.

     // План
     // Обратиться к первому элементу массива, а затем к последнему.

    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        int firstElement = arr[0];
        int lastElement = arr[arr.length - 1];
        return new int[]{firstElement, lastElement};
    }
}
