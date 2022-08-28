package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kata58 {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(9, 3, "7", "3")));
        System.out.println(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
        System.out.println(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        System.out.println(sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
        System.out.println(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        System.out.println(sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
    }

    // Учитывая массив целых чисел в виде строк, и чисел вернуть сумму значений массива (List), как если бы все они были числами.

    // План
    // Пробежаться по массиву, если элемент под индексом в цикле типа int, прибавить его значение к int sum.
    // Если элемент под индексом типа String, тоже прибавить его к int sum, используя Integer.parseInt.

    public static int sum(List<?> mixed) {
        int sumOfElements = 0;

        for (Object element  : mixed) {
            if (element instanceof Integer) {
                sumOfElements += (Integer) element;
            }
            if (element instanceof String) {
                sumOfElements += Integer.parseInt(element.toString());
            }
        }
        return sumOfElements;
    }

}
