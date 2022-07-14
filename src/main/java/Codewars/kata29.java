package Codewars;

import java.util.Arrays;

public class kata29 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1, 4)));
        System.out.println(Arrays.toString(between(-2, 2)));


    }

    // Завершить функцию которая принимает два целых числа, a,b , где a < b.
    // Вернуть массив всех целых чисел между входными параметрами, включая их.
    // a = 3; b = 10; 3, 4, 5, 6, 7, 8, 9, 10
    public static int[] between(int a, int b) {
        int[] numbers = new int[b - a + 1];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = a++;
        }
        return numbers;
    }
}