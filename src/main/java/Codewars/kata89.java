package Codewars;

import java.util.Arrays;
import java.util.Collections;

public class kata89 {
    public static void main(String[] args) {

        System.out.println(isAscOrder(new int[]{1, 2}));
        System.out.println(isAscOrder(new int[]{2, 1}));
        System.out.println(isAscOrder(new int[]{1, 2, 3}));
        System.out.println(isAscOrder(new int[]{1, 4, 13, 97, 508, 1047, 20058}));
        System.out.println(isAscOrder(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}));
        System.out.println(isAscOrder(new int[]{56, 98, 123, 67, 742, 1024, 32, 90969}));

    }
    // Получаем массив интеджеров. Нам нужно, определить, находятся ли числа в возрастающем порядке.
    // Говорят, что массив находятся в порядке возрастания, если нет двух соседних целых чисел, где левое целое число
    // превышает по значению правое целое число.
    // Массивы которые приходят содержат только интеджеры.

    // План
    // Отсортировать массив
    // Вернуть true.


    public static boolean isAscOrder(int[] arr) {
        boolean sameInteger = true;
        boolean singleInteger = true;
        if (arr[0] == 0) {
            return singleInteger;
        }
        if (arr[0] == arr.length + 1) {
            return sameInteger;
        }
        boolean ascOrder = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                ascOrder = false;
                break;
            }
        }
        return ascOrder;
    }
}
