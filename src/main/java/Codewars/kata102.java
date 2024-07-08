package Codewars;

import java.util.Arrays;
import java.util.Collections;

public class kata102 {
    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{10,14,2,23,19}));
        System.out.println(largestPairSum(new int[]{-100,-29,-24,-19,19}));
        System.out.println(largestPairSum(new int[]{1,2,3,4,6,-1,2}));
        System.out.println(largestPairSum(new int[]{-10,-8,-16,-18,-19}));
    }

    // Дана последовательность чисел (массив), нужно найти наибольшую сумму пар в последовательности.
    // Пример: [10, 14, 2, 23, 19] -->  42 (= 23 + 19)

    // План
    // Отсортировать массив обратной сортировкой, сложить первый (нулевой) и второй элемент, return sum.


    public static int largestPairSum(int[] numbers){
        Integer[] newArray = Arrays.stream(numbers).boxed().toArray( Integer[]::new );
        Arrays.sort(newArray, Collections.reverseOrder());

       return newArray[0] + newArray[1];
    }
}
