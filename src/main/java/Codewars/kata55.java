package Codewars;

import java.util.Arrays;

public class kata55 {
    public static void main(String[] args) {
        System.out.println(expressionsMatter(2, 1, 2));
        System.out.println(expressionsMatter(1, 1, 1));
        System.out.println(expressionsMatter(2, 1, 1));
        System.out.println(expressionsMatter(1, 2, 3));
        System.out.println(expressionsMatter(1, 3, 1));
        System.out.println(expressionsMatter(2, 2, 2));
    }

    // Даны три целых числа, a, b, c. Нужно вернуть наибольшее число, после вставки следующих операторок и скобок
    // +, *, () .   Перепробовать множество комбинаций, для того чтобы вернуть наибольшее число.

    // План: Если a > b, и b > c, c > a, то (a + b) * c;
    // Если a = b = c, сложить a + b + c;

    public static int expressionsMatter(int a, int b, int c) {
        int max = (a + b) * c;
        int max2 = a + b + c;
        int max3 = a * b * c;
        int max4 = a * (b + c);
        int[] arr = new int []{max, max2, max3, max4};
        Arrays.sort(arr);


        return arr[arr.length - 1];
    }
}


