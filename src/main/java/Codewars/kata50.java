package Codewars;

import java.util.Arrays;

public class kata50 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2)));
        System.out.println(Arrays.toString(divisibleBy(new int[]{1,2,3,4,5,6}, 3)));
        System.out.println(Arrays.toString(divisibleBy(new int[]{0,1,2,3,4,5,6}, 4)));
    }
           // Два аргумента, массив int numbers, devider - делитель.
           // Нужно завершить функцию которая принимает два аргумента и возвращает все числа, которые делятся 
           // на заданный делитель.
           
           // Создание sb, пробежаться по массиву numbers, если деление без остатка, sb.append во второй массив.
           // return второго массива.
    
    public static int[] divisibleBy(int[] numbers, int divider) {
      //  StringBuilder sb = new StringBuilder();
        int count = 0;
        int i = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                count++;
            }
        }
        int[] arr = new int [count];

        for (int number : numbers) {
            if (number % divider == 0) {
                arr[i] = number;
                i++;
            }
        }
        return arr;
    }
}
