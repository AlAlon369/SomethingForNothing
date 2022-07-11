package Codewars;

import java.util.Arrays;

import static java.lang.Integer.sum;

public class kata27 {
    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        System.out.println(arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
        System.out.println(arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
        System.out.println(arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));
    }


    // Нужнно получить сумму двух массивов.
    // Каждый массив ключает только целые числа.
    // Выход (return) тоже число.

    // Нам нады два массива, arr1, и arr2, нужно сложить сумму их элементов.

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int summaElementov = 0;
        for (int element : arr1) {
            summaElementov += element;
        }
        for (int element2 : arr2) {
            summaElementov += element2;
        }
        return summaElementov;
        //  return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }
}



