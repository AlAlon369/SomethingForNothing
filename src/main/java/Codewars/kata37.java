package Codewars;

import java.util.Arrays;
import java.util.Collections;

public class kata37 {
    public static void main(String[] args) {
      //  System.out.println(sortDesc(0));
      //  System.out.println(sortDesc(15));
        System.out.println(sortDesc(123456789));

    }
    // Создать функцию которая принимает любое не отрицательное число качестве аргумента,
    // и возвращает его с цифрами в порядке убывания, переставтье числа цифры чтобы получить максимальное число.

    // План
    // Расплитить числа.
    // Циклом foreach пробежаться по массиву чисел.
    // вернуть результат (Integer.parseInt)

    // sort, return Integer.parseInt



    public static int sortDesc(final int num) {
        String[] numbers = String.valueOf(num).split("");
        Arrays.sort(numbers, Collections.reverseOrder());
        String element = "";

        for (String number : numbers) {
            element += number;
        }
        return Integer.parseInt(element);
    }
}
