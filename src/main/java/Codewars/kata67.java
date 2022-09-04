package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kata67 {
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(Arrays.asList(0, 0, 0, 1)));
        System.out.println(ConvertBinaryArrayToInt(Arrays.asList(1, 1, 1, 1)));
        System.out.println(ConvertBinaryArrayToInt(Arrays.asList(0, 1, 1, 0)));
        System.out.println(ConvertBinaryArrayToInt(Arrays.asList(1, 0, 0, 1)));
    }
    // Учитывая массив едениц и нулей, преобразуйте эквивалентное двоичное значение в целое число.
    // Например [0, 0, 0, 1] рассматривается как 0001 двоичное представление 1.

    // Конвертнуть содержимое внутри листа (массива) в строку.
    // Получив массив строк, использовать Integer.parseInt(inp, 2)
    // ???

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder sb = new StringBuilder();
        for (Integer integer : binary) {
            sb.append(integer);
        }
        String s = sb.toString();
        int x = Integer.parseInt(s, 2);
        return x;
         //return Integer.parseInt(sb.toString(), 2);
    }
}